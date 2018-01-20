create index IX_A523CC20 on GM_TraccarGroup (groupId);
create index IX_FB11F064 on GM_TraccarGroup (traccarGroupId);
create index IX_9EE82F3E on GM_TraccarGroup (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3E8F6D40 on GM_TraccarGroup (uuid_[$COLUMN_LENGTH:75$], groupId);