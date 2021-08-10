package com.mediaassetask.request;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class ChatRequest extends AbstractModel{
  
  /**
  * 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
  */
  @SerializedName("AppID")
  @Expose
  private Long AppID;

  /**
  * 调用的api操作名
  */
  @SerializedName("Action")
  @Expose
  private String Action;

  /**
  * 业务 ID
  */
  @SerializedName("TIBusinessID")
  @Expose
  private long TIBusinessID;

  /**
  * 项目 ID
  */
  @SerializedName("TIProjectID")
  @Expose
  private long TIProjectID;


  public String setAppID() {
      return ;
  }

  /**
   * Set 聊天输入文本
   * @param Text 聊天输入文本
   */
  public void setText(String Text) {
      this.Text = Text;
  }

  /**
   * Get 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。 
   * @return ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
   */
  public Long getProjectId() {
      return this.ProjectId;
  }

  /**
   * Set 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
   * @param ProjectId 腾讯云项目 ID，可填 0，总长度不超过 1024 字节。
   */
  public void setProjectId(Long ProjectId) {
      this.ProjectId = ProjectId;
  }

  /**
   * Get json格式，比如 {"id":"test","gender":"male"}。记录当前与机器人交互的用户id，非必须但强烈建议传入，否则多轮聊天功能会受影响 
   * @return User json格式，比如 {"id":"test","gender":"male"}。记录当前与机器人交互的用户id，非必须但强烈建议传入，否则多轮聊天功能会受影响
   */
  public String getUser() {
      return this.User;
  }

  /**
   * Set json格式，比如 {"id":"test","gender":"male"}。记录当前与机器人交互的用户id，非必须但强烈建议传入，否则多轮聊天功能会受影响
   * @param User json格式，比如 {"id":"test","gender":"male"}。记录当前与机器人交互的用户id，非必须但强烈建议传入，否则多轮聊天功能会受影响
   */
  public void setUser(String User) {
      this.User = User;
  }

  public ChatRequest() {
  }

  /**
   * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
   *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
   */
  public ChatRequest(ChatRequest source) {
      if (source.Text != null) {
          this.Text = new String(source.Text);
      }
      if (source.ProjectId != null) {
          this.ProjectId = new Long(source.ProjectId);
      }
      if (source.User != null) {
          this.User = new String(source.User);
      }
  }


  /**
   * Internal implementation, normal users should not use it.
   */
  public void toMap(HashMap<String, String> map, String prefix) {
      this.setParamSimple(map, prefix + "Text", this.Text);
      this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
      this.setParamSimple(map, prefix + "User", this.User);

  }
}