package hello.upload.Controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {

    private Long itemIdl;
    private String itemName;
    private List<MultipartFile> imageFiles;
    private MultipartFile attachFile;

}
