ALTER TABLE postgres.homework.user
ALTER COLUMN id SET DEFAULT nextval('hibernate_sequence');