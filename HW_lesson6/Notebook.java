package HW_lesson6;

/**
 * Notebook
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. 

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например:	“Введите цифру, соответствующую необходимому критерию:	
					1 - ОЗУ
					2 - Объем ЖД
					3 - Операционная система
					4 - Цвет

4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

приветствие 
Выбор параметра
выбор конкретнее
вывод подходящих

*/

public class Notebook {
    
	private Double diagonal;         // Диагональ
    private String model;            // Модель
    private Integer device_memory;   // Обьем памяти
    private String type_memory;      // Тип пямяти
    private String manufacturer;     // Производитель
    private String device_color;     // Цвет компка
    private String operating_system; // ОС
    private Integer ram;             // Оперативная память
    private String type_ram;         // Тип оперативки
    private Integer price;           // Цена
    

    public Notebook (String manufacturer, String model, String device_color, Double diagonal, 
				    Integer device_memory, String type_memory, Integer ram, String type_ram, 
					String operating_system, Integer price) 
	{
        this.manufacturer = manufacturer;
        this.model = model;
        this.device_color = device_color;
        this.diagonal = diagonal;
        this.device_memory = device_memory;
        this.type_memory = type_memory;
        this.ram = ram;
        this.type_ram = type_ram;
        this.operating_system = operating_system;
        this.price = price;
	}

    @Override
	public String toString() {
		return "Ноутбук производителя : " + manufacturer + "\tМодель : " + model +
					"\n\tХарактеристики : " + 
						"\n\t\tЦвет компьютера : " + device_color + ", Диагональ экрана : " + diagonal + 
						"\n\t\tТип устройства хранения : " + type_memory + ", Обьем памяти компьютера : " + device_memory + 
						"\n\t\tТип оперативой памяти : " + type_ram + ", Обьем оперативной памяти : " + ram + 
						"\n\t\tОперативная система : " + operating_system + ", Цена устройства : " + price;
	}

    public Double getDiagonal() {
        return diagonal;
    }

    public String getModel() {
        return model;
    }

    public Integer getDevice_memory() {
        return device_memory;
    }

    public String getType_memory() {
        return type_memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDevice_color() {
        return device_color;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public Integer getRam() {
        return ram;
    }

    public String getType_ram() {
        return type_ram;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((diagonal == null) ? 0 : diagonal.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((device_memory == null) ? 0 : device_memory.hashCode());
        result = prime * result + ((type_memory == null) ? 0 : type_memory.hashCode());
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + ((device_color == null) ? 0 : device_color.hashCode());
        result = prime * result + ((operating_system == null) ? 0 : operating_system.hashCode());
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((type_ram == null) ? 0 : type_ram.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Notebook other = (Notebook) obj;
        if (diagonal == null) {
            if (other.diagonal != null)
                return false;
        } else if (!diagonal.equals(other.diagonal))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (device_memory == null) {
            if (other.device_memory != null)
                return false;
        } else if (!device_memory.equals(other.device_memory))
            return false;
        if (type_memory == null) {
            if (other.type_memory != null)
                return false;
        } else if (!type_memory.equals(other.type_memory))
            return false;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (device_color == null) {
            if (other.device_color != null)
                return false;
        } else if (!device_color.equals(other.device_color))
            return false;
        if (operating_system == null) {
            if (other.operating_system != null)
                return false;
        } else if (!operating_system.equals(other.operating_system))
            return false;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (type_ram == null) {
            if (other.type_ram != null)
                return false;
        } else if (!type_ram.equals(other.type_ram))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        } else if (!price.equals(other.price))
            return false;
        return true;
    }
}