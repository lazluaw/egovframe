package com.test.web.enums;

public enum Sql {
	CREATE_DB,
	CREATE_USER, DROP_USER, TRUNCATE_USER, CREATE_BOARD, DROP_BOARD, TRUNCATE_BOARD,
	CREATE_IMAGE, DROP_IMAGE, TRUNCATE_IMAGE; //이미지는 따로 만들어주는 게 좋음
	
	@Override
	public String toString() {
		String result = "";
		switch(this) {
		case CREATE_DB:
			result = "create database mariadb";
			break;
		case CREATE_USER:
			result = "create table user(user_idx int as userIdx auto_increment not null,"
					+"user_id varchar(40) as userId not null,"
					+"user_password varchar(40) as userPassword not null,"
					+"user_email varchar(40) as userEmail not null,"
					+"insert_date datetime as insertDate not null,"
					+"update_date datetime as updateDate not null,"
					+"constraint user_pk primary key (user_idx))ENGINE=InnoDB DEFAULT CHARSET=UTF8" ;
			break;
		case DROP_USER: 
			result = "drop table user";
			break;
		case TRUNCATE_USER: 
			result = "truncate table user";
			break;
		case CREATE_BOARD: 
			result = "create table board(user_idx int as userIdx not null,"
				+"post_idx int as postIdx auto_increment not null,"
				+"post_title varchar(100) as postTitle not null,"
				+"post_content text as postContent not null,"
				+"img_file varchar(300) as imgFile,"
				+"insert_date datedime as insertDate not null,"
				+"update_date datetime as updateDate not null,"
				+"tag_content varchar(100) as tagContent not null,"
				+"post_like bit as postLike not null,"
				+"post_like_count int as postLikeCount not null,"
				+"comment_count int as commentCount not null,"
				+"constraint board_pk primary key (post_idx),"
				+"constraint board_fk foreign key (user_idx) references user(user_idx))ENGINE=InnoDB DEFAULT CHARSET=UTF8" ;
			break;
		case DROP_BOARD: 
			result = "drop taeble board";
			break;
		case TRUNCATE_BOARD: 
			result = "truncate table board";
			break;
		case CREATE_IMAGE:
			result = "create table image";
			break;
		case DROP_IMAGE:
			result = "drop table image";
			break;
		case TRUNCATE_IMAGE: 
			result = "truncate table image";
			break;
		default:
			break;
		}
		return result;
	}
}

