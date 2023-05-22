package com.tikkeul.app.domain.dto;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Search {
    String type;
    String keyword;

    public String[] getTypes(){
        return type.split("");
    }

    public Search(String type, String keyword){
        this.type = type;
        this.keyword = keyword;
    }
}