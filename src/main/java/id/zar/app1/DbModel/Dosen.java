package id.zar.app1.DbModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dosen {
    private String id;
    private String nama;
    private String prodi;
}
