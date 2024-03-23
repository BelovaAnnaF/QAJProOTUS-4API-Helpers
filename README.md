# QAJProOTUS-4API-Helpers
Цель:
1.Реализовать Stub сервер со следующими методами-заглушами

получение списка пользователей
получение списка курсов
оценка пользователя
Создать "хелперы" (API-helpers) для работы с API.
Это можно сделать в отдельном проекте. API-helpers должны тестировать реальные сервисы в интернете или сервисы развернутые на вашей локальной машине.
Нужно поработать с:
http-helper
soap-helper
дополнительное, более сложное задание (по желанию) :
создать рабочий sql-helper (для получения данных из БД)
создать рабочий mq-helper (для отправки данных в менеджер сообщений)
Вышеуказанные задачи можно реализовать с помощью Citrus Framework.
По http запросам можно применить RestAssured, Retrofit или Citrus (на ваше усмотрение).
Для заглушек можно использовать Wiremock или Citrus Framework (на ваше усмотрение).


Описание/Пошаговая инструкция выполнения домашнего задания:
Необходимо реализовать Stub сервер на Wiremock со следующими endpoint'ами:
/user/get/{id} для получение оценки пользователя
/cource/get/all для получения списка курсов
/user/get/all - для получения списка всех пользователей
Контракты
Для user
{
"name":"Test user",
"cource":"QA",
"email":"test@test.test"
"age": 23
}
Для оценки:
{
"name":"Test user",
"score": 78
}
Для курсов:
[
{
"name":"QA java",
"price": 15000
},
{
"name":"Java",
"price": 12000
}
]
Подключить stub frontend, написать тесты для проверки json cхем.
2.

создать тест с http-helper
создать тест с soap-helper
дополнительно (по желанию):
создать тест с sql-helper
создать тест с mq-helper
