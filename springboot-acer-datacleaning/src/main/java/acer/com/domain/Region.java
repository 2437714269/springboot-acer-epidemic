package acer.com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Region {

    //地区名字
    private String name;
    //现有人数
    private int nowConfirm;
    //累计人数
    private int confirm;
    //死亡人数
    private int dead;
    //治愈人数
    private int heal;
}
