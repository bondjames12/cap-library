// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.publicalerts.cap;

public interface InfoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {
  
  // optional string language = 1 [default = "en-US"];
  boolean hasLanguage();
  String getLanguage();
  
  // repeated .alerts.cap.Info.Category category = 2;
  java.util.List<com.google.publicalerts.cap.Info.Category> getCategoryList();
  int getCategoryCount();
  com.google.publicalerts.cap.Info.Category getCategory(int index);
  
  // required string event = 3;
  boolean hasEvent();
  String getEvent();
  
  // repeated .alerts.cap.Info.ResponseType response_type = 4;
  java.util.List<com.google.publicalerts.cap.Info.ResponseType> getResponseTypeList();
  int getResponseTypeCount();
  com.google.publicalerts.cap.Info.ResponseType getResponseType(int index);
  
  // required .alerts.cap.Info.Urgency urgency = 5;
  boolean hasUrgency();
  com.google.publicalerts.cap.Info.Urgency getUrgency();
  
  // required .alerts.cap.Info.Severity severity = 6;
  boolean hasSeverity();
  com.google.publicalerts.cap.Info.Severity getSeverity();
  
  // required .alerts.cap.Info.Certainty certainty = 7;
  boolean hasCertainty();
  com.google.publicalerts.cap.Info.Certainty getCertainty();
  
  // optional string audience = 8;
  boolean hasAudience();
  String getAudience();
  
  // repeated .alerts.cap.ValuePair event_code = 9;
  java.util.List<com.google.publicalerts.cap.ValuePair> 
      getEventCodeList();
  com.google.publicalerts.cap.ValuePair getEventCode(int index);
  int getEventCodeCount();
  java.util.List<? extends com.google.publicalerts.cap.ValuePairOrBuilder> 
      getEventCodeOrBuilderList();
  com.google.publicalerts.cap.ValuePairOrBuilder getEventCodeOrBuilder(
      int index);
  
  // optional string effective = 10;
  boolean hasEffective();
  String getEffective();
  
  // optional string onset = 11;
  boolean hasOnset();
  String getOnset();
  
  // optional string expires = 12;
  boolean hasExpires();
  String getExpires();
  
  // optional string sender_name = 13;
  boolean hasSenderName();
  String getSenderName();
  
  // optional string headline = 14;
  boolean hasHeadline();
  String getHeadline();
  
  // optional string description = 15;
  boolean hasDescription();
  String getDescription();
  
  // optional string instruction = 16;
  boolean hasInstruction();
  String getInstruction();
  
  // optional string web = 17;
  boolean hasWeb();
  String getWeb();
  
  // optional string contact = 18;
  boolean hasContact();
  String getContact();
  
  // repeated .alerts.cap.ValuePair parameter = 19;
  java.util.List<com.google.publicalerts.cap.ValuePair> 
      getParameterList();
  com.google.publicalerts.cap.ValuePair getParameter(int index);
  int getParameterCount();
  java.util.List<? extends com.google.publicalerts.cap.ValuePairOrBuilder> 
      getParameterOrBuilderList();
  com.google.publicalerts.cap.ValuePairOrBuilder getParameterOrBuilder(
      int index);
  
  // repeated .alerts.cap.Resource resource = 20;
  java.util.List<com.google.publicalerts.cap.Resource> 
      getResourceList();
  com.google.publicalerts.cap.Resource getResource(int index);
  int getResourceCount();
  java.util.List<? extends com.google.publicalerts.cap.ResourceOrBuilder> 
      getResourceOrBuilderList();
  com.google.publicalerts.cap.ResourceOrBuilder getResourceOrBuilder(
      int index);
  
  // repeated .alerts.cap.Area area = 21;
  java.util.List<com.google.publicalerts.cap.Area> 
      getAreaList();
  com.google.publicalerts.cap.Area getArea(int index);
  int getAreaCount();
  java.util.List<? extends com.google.publicalerts.cap.AreaOrBuilder> 
      getAreaOrBuilderList();
  com.google.publicalerts.cap.AreaOrBuilder getAreaOrBuilder(
      int index);
}