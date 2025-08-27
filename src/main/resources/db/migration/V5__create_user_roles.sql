CREATE TABLE IF NOT EXISTS auth.user_roles(
id SERIAL PRIMARY KEY,
user_id INT NOT NULL,
role_id INT NOT NULL,
UNIQUE(user_id, role_id),
FOREIGN KEY(user_id) REFERENCES auth.users(id) ON DELETE CASCADE,
FOREIGN KEY(role_id) REFERENCES auth.roles(id) ON DELETE CASCADE
);
