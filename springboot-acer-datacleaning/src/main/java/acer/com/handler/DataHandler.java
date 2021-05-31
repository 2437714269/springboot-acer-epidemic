package acer.com.handler;


import acer.com.domain.Region;
import com.google.gson.Gson;

import java.io.FileReader;
import java.util.List;

/**
 *  这个类的作用：
 *  1.读取清洗好的数据
 *  2.将读取的数据用Gson组装成一个对象
 */
public class DataHandler {

    public static void main(java.lang.String[] args){


    }

    public List<Region> select(){
        StringBuilder builder = new StringBuilder();
        try{

            FileReader fr = new FileReader("test.txt");
            char[] c = new char[1024];
            int count = fr.read(c);
            while(count!=-1){
                Gson gson = new Gson();

                count = fr.read(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
