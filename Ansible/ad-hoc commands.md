# Ad-Hoc Commands

## Messing around with different groups
- Ping all linux servers: `ansible linux -m ping -i inventory.yml`
- Ping only webservers: `ansible webservers -m ping -i inventory.yml`
- Ping only database servers: `ansible database_servers -m ping -i inventory.yml`

## Messing around with different modules
- Get hostnames of all linux machines: `ansible linux -m command -a "hostname" -i inventory.yml`
- Get available disk space of all linux machines: `ansible linux -m command -a "df -h" -i inventory.yml`
- Get memory stats of all linux machines: `ansible linux -m command -a "free -h" -i inventory.yml`
- Install htop across all linux machines: `ansible linux -m package -a "name=htop state=present" -i inventory.yml -b --ask-become-pass`
- Install nginx across all webservers: `ansible webservers -m package -a "name=nginx state=present" -i inventory.yml -b --ask-become-pass`
- Enable nginx with systemd across all webservers: `ansible webservers -m systemd -a "name=nginx enabled=yes state=started" -i inventory.yml -b --ask-become-pass`