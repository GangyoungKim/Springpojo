package com.springpojo.app.chatDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Chat {
	// 채팅방번호?
	@Id @GeneratedValue
	private Long ChatNum;
	
	// 채팅사용자... 2명...?
	private String ChatUser1;
	private String ChatUser2;
	
	// 채팅 내용
	private String ChatComment;
}
