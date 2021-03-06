package Utils;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by Daniil on 08.07.2018.
 */
public class LogicOLX {
    public void WaitAndDelete()
    {
        Timer timer = new Timer();
        timer.schedule(new DeleteItemOLX(), 4000);
    }
 ;
    class DeleteItemOLX extends TimerTask {
        public void run() {
            main.DeleteOLXitem();
        }
    }

    class AddItemOLX extends TimerTask {
        public void run() {
            try {


                Thread.sleep(3000);
                main.AddItemOLX("C:\\Users\\Daniil\\Desktop\\Облигация", "Имперская облигация Австро-Венгрии 1863г", "Продам  облигацию:  Австрийского Императорского Общества Государственных железных дорог  в 500 франков 1863 года.\n" +
                        "Гарантированный оригинал с более чем 150 летней историей.\n" +
                        "\n" +
                        "На обратной стороне расписан план выплат по облигациям до с указанием сумм до 1957 года.\n" +
                        "Однако выплаты по облигациям приостановлены в 1918 году в связи с падением монархии Габсбургов и разделом Австро-Венгрии в результате поражения в 1 мировой войне.\n" +
                        "\n" +
                        "Продается как предмет коллекционирование, офисное украшение: отлично смотрится в рамке на стене. \n" +
                        "\n" +
                        "По всем вопросам пишите\\звоните, обмен не  интересует.\n" +
                        "На данный момент нахожусь в Одесской области, по Украине отправлю Новой Почтой.", 1500);
                Thread.sleep(3000);
/*
                main.AddItemOLX("C:\\Users\\Daniil\\Desktop\\Pocket Watch #2", "Золотые швейцарские часы конец 1 половины XIX века (1840-1850е гг.)", "Продам золотые швейцарские карманные часы,ориентировочно 1840-1850е гг. Часы произведены в Швейцарии,в городе Женева.\n" +
                        "Часы в хорошем коллекционом состоянии, как внешне так и функционально.Находятся в рабочем состоянии, были в сервисе(очистка).\n" +
                        "Ничего не менялось. \n" +
                        "Часы в массивном золотом корпусе достаточно редкой пробы (как для корпуса золотых карманных часов) 15k - 625 проба.\n" +
                        "На внутренней крышке фирменная гравировка имени часовщика,так же серийный номер и город(Женева).\n" +
                        "Сохранился оригинальный футляр, который продавался вместе с часами. На футляре также указано имя часовщика,город и серийный номер часов. \n" +
                        "Так же в футляре во втором ложементе справа сохранились два оригиналных запасных стекла,упаковка которых подписанна серийным номером часов. \n" +
                        "\n" +
                        "С часами идут два ключа (один переводит стрелки, второй заводит часы) и золотая цепочка(около 27 см). \n" +
                        "Один ключ позолоченный оригинальный, второй современный (для завода часов).\n" +
                        "Цепь же вероятно докупалась отдельно следующим владельцем позже,цепочка маркирована 14k(585 проба) и датой прозводства 1918 год. \n" +
                        "Масса золота в цепи около 6 грамм. Карабин между часами и цепочкой не золотой.\n" +
                        "\n" +
                        "Основные характеристики:\n" +
                        "\n" +
                        "Диаметр: 50.2 мм\n" +
                        "Масса часов: 91.3 г. (из них 48 грамм корпус без механизма)\n" +
                        "Материал корпуса: Золото 15к (625 проба)\n" +
                        "Дата выпуска: 1840-1850-е\n" +
                        "Серийный номер: 17415\n" +
                        "\n" +
                        "Комплектация:\n" +
                        "-Золотые часы\n" +
                        "-Золотая цепь\n" +
                        "-Два ключа\n" +
                        "-Оригинальный футляр производителя\n" +
                        "-Два оригинальных запасных стекла\n" +
                        "-Акт результатов исследования корпуса часов.\n" +
                        "\n" +
                        "\n" +
                        "По данным часам проводилась экспертиза корпуса часов в центральном казенном предприятии пробирного контроля при Министерстве Финансов Украины в г.Киеве. \n" +
                        "Акт результатов исследования идет вместе с часами.\n" +
                        "Корпус - золото 650 пробы (30.89 грамм)\n" +
                        "Головка и кольцо - золото 750 пробы (12.62 грамм)\n" +
                        "Итоговая масса золота по резульатам исследования корпуса- 43.51 г.\n" +
                        "Общая масса золота включая цепь около 50 грамм.\n" +
                        "\n" +
                        "Тип часового механизма - оригинальный Fontainmelon-1 на уверенном ходу (применялся в создании карманных часах с 1796-1850гг).\n" +
                        "Возможна отправка наложенным платежом Новой Почтой или личная встреча в Одессе.", 52000);

                Thread.sleep(3000);
                main.AddItemOLX("C:\\Users\\Daniil\\Desktop\\Russian bonds", "Коллекция имперских облигаций 19 века, 8 штук", "Распродаю коллекцию раритетных акций, облигаций Российской Империи. Хороший подарок деловому человеку, домашнее, офисное украшение(можно поставить в рамку).\n" +
                        "\n" +
                        "Все акции оригиналы: мокрые печати,фактурная бумага, фактурные печати,оригинальные подписи, водяные знаки и т.д.\n" +
                        "\n" +
                        "8 разных акций/облигаций Российской империи (выпусков с середины 19 века до 1914 года).\n" +
                        "Представлены различные отрасли и типы ценных бумаг, все разные : \n" +
                        "\n" +
                        "1.Российский правительственный 4% консолидированый железнодорожный займ в 125 рублей 1880 года\n" +
                        "2.Российский правительственная 4% консолидированая рента 1901 года в 500 франков\n" +
                        "3.Заем города Санкт-Петербурга 1908 года в 187.5 рублей\n" +
                        "4.Акция Русско-Азиатского Банка 1911 года в 187.5 рублей\n" +
                        "5.4.5% заем Черноморской железной дороги 1913 года в 187.5 рублей\n" +
                        "6.Акция Таганрогского металургического общества 1912 года в 150 рублей\n" +
                        "7. 4% облигация Владикавказкой железной дороги в 2000 немецких марок(617.2 рублей) 1897 года\n" +
                        "8. 4.5% облигация Московско-Казанской железной дороги 1914 года в 187.5 рублей\n" +
                        "\n" +
                        "Большинство облигаций большие, формата около А3.\n" +
                        "\n" +
                        "В данный момент нахожусь в Одесской области(г.Южный), в другие города отправлю наложенным платежом. Цена указана окончательная - без торга.", 2500);
*/                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public void WaitAndAdd()
    {
        Timer timer = new Timer();
        timer.schedule(new AddItemOLX(), 3000);

    }
}



