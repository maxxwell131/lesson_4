public class Calculator {
	/**
		Результат вычесления
	*/
	private int result;

	/**
		Суммируем аргументы.
		@param params Аргументы суммирования.
	*/
	public void add(int ... params){
		for (Integer param : params ) {
			this.result += param;
		}
	}

	/**
	Получить результат.
	@return результат вычисленияю
	*/
	public int getResult(){
		return this.result;
	}

	/**
	Очистить результат вычисления
	*/
	public void clearResult(){
		this.result = 0;
	}
}