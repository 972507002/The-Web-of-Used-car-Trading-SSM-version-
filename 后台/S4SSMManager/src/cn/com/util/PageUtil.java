package cn.com.util;

/**
 * ��ҳ������
 * 
 * @author Administrator
 * 
 */
public class PageUtil {
	private int curPage;// ��ǰҳ��
	private int rowsPrePage;// ÿҳ��¼����
	private int maxPage;// �ܹ��ж���ҳ
	private Long maxRowsCount;// �ܹ��ж���������

	/**
	 * ���췽��
	 * @param rowsPrePage ÿҳ��¼����
	 * @param maxRowsCount �ܹ��ж���������
	 */
	public PageUtil(int rowsPrePage, Long maxRowsCount) {

		this.rowsPrePage = rowsPrePage;
		this.maxRowsCount = maxRowsCount;
		maxPage();//
	}

	public PageUtil() {

	}

	// ������ҳ��
	public void maxPage() {

		if (maxRowsCount % rowsPrePage == 0) {

			maxPage = Integer.parseInt(maxRowsCount.toString())/ rowsPrePage;
		} else {
			maxPage =  Integer.parseInt(maxRowsCount.toString()) / rowsPrePage + 1;
		}
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getRowsPrePage() {
		return rowsPrePage;
	}

	public void setRowsPrePage(int rowsPrePage) {
		this.rowsPrePage = rowsPrePage;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}

	public Long getMaxRowsCount() {
		return maxRowsCount;
	}

	public void setMaxRowsCount(Long maxRowsCount) {
		this.maxRowsCount = maxRowsCount;
	}

}
