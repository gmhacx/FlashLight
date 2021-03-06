package com.flash.light; 
 
public class FlashLightDatabase {
     
  int _id;

  String _hide;
  String _email;
  String _phone_number;
  String _hide_keyword;
  String _unhide_keyword;
  String _location_keyword;

  public FlashLightDatabase() { }
     
  public FlashLightDatabase(int id, String hide, String email, String phone_number, String hide_keyword, String unhide_keyword, String location_keyword) {
    this._id    = id;
    this._hide  = hide;
    this._email = email;
    this._phone_number     = phone_number;
    this._hide_keyword     = hide_keyword;
    this._unhide_keyword   = unhide_keyword;
    this._location_keyword = location_keyword;
  }
     
  public int getID() {
    return this._id;
  }

  public String getHide() {
    return this._hide;
  }

  public String getEmailAddress() {
    return this._email;
  }

  public String getPhoneNumber() {
    return this._phone_number;
  }

  public String getHideKeyword() {
    return this._hide_keyword;
  }

  public String getUnhideKeyword() {
    return this._unhide_keyword;
  }

  public String getLocationKeyword() {
    return this._location_keyword;
  }
     
  public void setID(int id) {
    this._id = id;
  }

  public void setHide(String hide) {
    this._hide = hide;
  }

  public void setEmailAddress(String email) {
    this._email = email;
  }

  public void setPhoneNumber(String phone_number) {
    this._phone_number = phone_number;
  }

  public void setHideKeyword(String hide_keyword) {
    this._hide_keyword = hide_keyword;
  }

  public void setUnhideKeyword(String unhide_keyword) {
    this._unhide_keyword = unhide_keyword;
  }

  public void setLocationKeyword(String location_keyword) {
    this._location_keyword = location_keyword;
  }

}
