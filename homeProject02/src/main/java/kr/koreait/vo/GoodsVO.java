package kr.koreait.vo;

import java.io.File;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public class GoodsVO {
int idx;         // idx
String name;      // 이름
int price;      // 가격
String id_Number;   // 저장되는 파일이름
String category;   // 카테고리
String item_comment;// 설명
int volume;         // 주문량
String goodsDir;   // 경로
int goodsidx;      
int photo;         // 서브파일 수량
String goodsColor;   // 상품의 전체 색상
ArrayList<MultipartFile> sub_file = new ArrayList<MultipartFile>();   //다중 파일용 변수


public String getGoodsColor() {
   return goodsColor;
}
public void setGoodsColor(String goodsColor) {
   this.goodsColor = goodsColor;
}
public String getitem_comment() {
   return item_comment;
}
public void setitem_comment(String item_comment) {
   this.item_comment = item_comment;
}
public ArrayList<MultipartFile> getSub_file() {
   return sub_file;
}
public void setSub_file(ArrayList<MultipartFile> sub_file) {
   this.sub_file = sub_file;
}
public int getGoodsidx() {
   return goodsidx;
}
public void setGoodsidx(int goodsidx) {
   this.goodsidx = goodsidx;
}
public int getIdx() {
   return idx;
}
public void setIdx(int idx) {
   this.idx = idx;
}
public String getName() {
   return name;
}
public void setName(String name) {
   this.name = name;
}
public int getPrice() {
   return price;
}
public void setPrice(int price) {
   this.price = price;
}

public String getId_Number() {
   return id_Number;
}
public void setId_Number(String id_Number) {
   this.id_Number = id_Number;
}
public String getCategory() {
   return category;
}
public void setCategory(String category) {
   this.category = category;
}
public int getVolume() {
   return volume;
}
public void setVolume(int volume) {
   this.volume = volume;
}
public String getGoodsDir() {
   return goodsDir;
}
public void setGoodsDir(String goodsDir) {
   this.goodsDir = goodsDir;
}

public int getPhoto() {
   return photo;
}
public void setPhoto(int photo) {
   this.photo = photo;
}
@Override
public String toString() {
   return "GoodsVO [idx=" + idx + ", name=" + name + ", price=" + price + ", id_Number=" + id_Number + ", category="
         + category + ", item_comment=" + item_comment + ", volume=" + volume + ", goodsDir=" + goodsDir
         + ", goodsidx=" + goodsidx + ", photo=" + photo + ", goodsColor=" + goodsColor + ", sub_file=" + sub_file
         + "]";
}
   
}