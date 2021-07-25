db.auth('root', 'RootSicredi');

db.createUser({
  user: 'sicredi',
  pwd: 'Sicredi@2021',
  roles: [
    {
      role: 'readWrite',
      db: 'voting-secredi'
    }
  ]
});