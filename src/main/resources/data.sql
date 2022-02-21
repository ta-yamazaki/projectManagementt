INSERT INTO 案件.案件
(案件名, クライアント名, 担当者名)
VALUES
('案件A', 'ABC株式会社', '山田 太郎'),
('案件B', '株式会社DDD', '佐藤 愛子'),
('案件C', 'Spring株式会社', '三宅 祐一');

INSERT INTO 金額.提示金額
(案件名, 提示金額)
VALUES
('案件A', 5000000),
-- ('案件B', 3000000),
('案件C', 10000000);

INSERT INTO 金額.受注金額
(案件名, 受注金額)
VALUES
('案件A', 5000000);


INSERT INTO 期間.案件スケジュール
(案件名, 開始, 終了)
VALUES
('案件A', CURRENT_DATE + 60, CURRENT_DATE + 180),
('案件B', CURRENT_DATE + 80, CURRENT_DATE + 120),
('案件C', CURRENT_DATE + 70, CURRENT_DATE + 240);


INSERT INTO 進捗.進捗
(案件名, 状態)
VALUES
('案件A', '提案済み'),
('案件B', '引き合い'),
('案件C', '受注');