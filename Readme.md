## Тема: Реализация системы мониторинга с использованием Spring Kafka

<details>
<summary>Полный текст задания</summary>
 Цель:
Создать систему мониторинга, которая будет отслеживать работу различных компонентов вашего приложения с помощью Spring Kafka.
 Эта система будет включать в себя Producer для отправки метрик, Consumer для их обработки и анализа, а также REST API для просмотра метрик.

Общая архитектура системы:

Producer Service:

Создать микросервис "Metrics Producer", который будет отслеживать и собирать метрики работы приложения и отправлять их в Kafka топик "metrics-topic".
Реализовать следующие API для взаимодействия с микросервисом:
POST /metrics: Отправка метрик работы приложения в формате JSON. Метрики могут включать информацию о производительности, использовании ресурсов, ошибках и т. д.
Consumer Service:

Создать микросервис "Metrics Consumer", который будет принимать метрики из Kafka топика "metrics-topic" и анализировать их для выявления проблем и трендов.
Реализовать обработку метрик и вывод статистики в логи или базу данных для последующего анализа.
REST API:

Реализовать REST API в микросервисе "Metrics Consumer" для просмотра метрик.
GET /metrics: Получение списка всех метрик.
GET /metrics/{id}: Получение конкретной метрики по ее идентификатору.

Критерии успешного выполнения:

Микросервисы должны успешно обмениваться данными через Kafka и обеспечивать сбор и анализ метрик работы приложения.
API должно быть хорошо спроектировано, документировано и соответствовать принципам RESTful.
Система должна быть масштабируемой, надежной и обладать высокой производительностью.
Должна быть предоставлена документация, объясняющая архитектуру системы, конфигурацию Kafka, а также инструкции по запуску и использованию системы.
</details>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white "Java 11")
![Maven](https://img.shields.io/badge/Maven-green.svg?style=for-the-badge&logo=mockito&logoColor=white "Maven")
![Spring](https://img.shields.io/badge/Spring-blueviolet.svg?style=for-the-badge&logo=spring&logoColor=white "Spring")
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![GitHub](https://img.shields.io/badge/git-%23121011.svg?style=for-the-badge&logo=github&logoColor=white "Git")
+ ЯП: *Java 17*
+ Автоматизация сборки: *Maven*
+ Фреймворк: *Spring*
+ Для Kafka *Docker* 
+ База данных: *PostgreSQL*
+ Контроль версий: *Git*

Для запуска приложения необходимо в aplication.properties указать настройки БД
1. запустить docker-compose.yaml
2. Запустить или установить Kafka
3. Запустить Metric producer и Metric Consumer
