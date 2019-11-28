package com.x.pojo;

public class PageUtils {

	/* 每页显示记录数目 */
	private int rows = 5;
	/* 当前页 */
	private int currPage = 1;
	/* 保存查询后的页数 */
	private int totalPage;
	/* 保存查询到的总记录数 */
	private int totalNumber;

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalPage() {
		int mod = totalNumber % rows;
		totalPage = totalNumber / rows;
		if (mod != 0) {
			totalPage++;
		}
		return totalPage;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

}
