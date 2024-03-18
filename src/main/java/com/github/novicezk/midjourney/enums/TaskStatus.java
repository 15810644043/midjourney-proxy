package com.github.novicezk.midjourney.enums;


import lombok.Getter;

public enum TaskStatus {
	/**
	 * 未启动.
	 */
	NOT_START(0),
	/**
	 * 已提交.
	 */
	SUBMITTED(1),
	/**
	 * 执行中.
	 */
	IN_PROGRESS(2),
	/**
	 * 失败.
	 */
	FAILURE(3),
	/**
	 * 成功.
	 */
	SUCCESS(4);

	@Getter
	private final int order;

	TaskStatus(int order) {
		this.order = order;
	}

}
