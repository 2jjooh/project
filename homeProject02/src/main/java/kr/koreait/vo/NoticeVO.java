package kr.koreait.vo;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public class NoticeVO {

   private int idx;
   private String title;
   private String content;
   private Date writeDate;
   private String attached = " ";
   int goodsidx;
   
   public int getGoodsidx() {
      return goodsidx;
   }
   public void setGoodsidx(int goodsidx) {
      this.goodsidx = goodsidx;
   }
   public String getAttached() {
      return attached;
   }
   public void setAttached(String attached) {
      this.attached = attached;
   }
   public int getIdx() {
      return idx;
   }
   public void setIdx(int idx) {
      this.idx = idx;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getContent() {
      return content;
   }
   public void setContent(String content) {
      this.content = content;
   }
   public Date getWriteDate() {
      return writeDate;
   }
   public void setWriteDate(Date writeDate) {
      this.writeDate = writeDate;
   }
   
   @Override
   public String toString() {
      return "NoticeVO [idx=" + idx + ", title=" + title + ", content=" + content + ", writeDate=" + writeDate + "]";
   }




   
}