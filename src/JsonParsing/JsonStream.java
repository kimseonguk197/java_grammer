package JsonParsing;//package JsonParsing;
//
////org.json.simple.parser download
////import org.json.JSONArray;
////import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Iterator;
//
//public class JsonStream {
//    public static void main(String[] args) throws Exception {
//        String text = "";
//        try {
//            text = new String(Files.readAllBytes(Paths.get("src/JsonParsing/test.json")), StandardCharsets.UTF_8);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        JSONObject jo = new JSONObject(text);
//        JSONArray ja = jo.getJSONArray("students");
//        for (int i = 0; i < ja.length(); i++) {
//            JSONObject obj = ja.getJSONObject(i);
//            int id = obj.getInt("id");
//            String name = obj.getString("name");
//            String class_name = obj.getString("class");
//            String city = obj.getString("city");
//        }
//
////        //stream 방식
////        students.stream().map(a->((JSONObject)a).get("Name")).forEach(System.out::println);
////        students.stream().map(a->((JSONObject)a).get("id")).forEach(System.out::println);
////        students.stream().map(a->((JSONObject)a).get("Class")).forEach(System.out::println);
////        students.stream().map(a->((JSONObject)a).get("City")).forEach(System.out::println);
//    }
//}
