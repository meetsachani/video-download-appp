package androidx.work.impl;

import androidx.room.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o.C10051uk2;
import o.C3842Ok2;
import o.C5800dN2;
import o.C6540gN2;
import o.C8414o20;
import o.C8958qG1;
import o.C8987qN2;
import o.C8990qO1;
import o.C9722tN2;
import o.InterfaceC10528wh2;
import o.InterfaceC10771xh2;
import o.InterfaceC5557cN2;
import o.InterfaceC6285fN2;
import o.InterfaceC8171n20;
import o.InterfaceC8715pG1;
import o.InterfaceC8744pN2;
import o.InterfaceC8747pO1;
import o.InterfaceC9479sN2;
import o.InterfaceC9808tk2;
import o.UT;
import o.VU1;
import o.WU1;
import o.XU;
import o.XU1;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile InterfaceC8744pN2 q;
    public volatile InterfaceC8171n20 r;
    public volatile InterfaceC9479sN2 s;
    public volatile InterfaceC9808tk2 t;
    public volatile InterfaceC5557cN2 u;
    public volatile InterfaceC6285fN2 v;
    public volatile InterfaceC8715pG1 w;
    public volatile InterfaceC8747pO1 x;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC8171n20 C() {
        InterfaceC8171n20 interfaceC8171n20;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new C8414o20(this);
                }
                interfaceC8171n20 = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8171n20;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC8715pG1 G() {
        InterfaceC8715pG1 interfaceC8715pG1;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new C8958qG1(this);
                }
                interfaceC8715pG1 = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8715pG1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC8747pO1 H() {
        InterfaceC8747pO1 interfaceC8747pO1;
        if (this.x != null) {
            return this.x;
        }
        synchronized (this) {
            try {
                if (this.x == null) {
                    this.x = new C8990qO1(this);
                }
                interfaceC8747pO1 = this.x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8747pO1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC9808tk2 I() {
        InterfaceC9808tk2 interfaceC9808tk2;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new C10051uk2(this);
                }
                interfaceC9808tk2 = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC9808tk2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC5557cN2 J() {
        InterfaceC5557cN2 interfaceC5557cN2;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new C5800dN2(this);
                }
                interfaceC5557cN2 = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5557cN2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC6285fN2 K() {
        InterfaceC6285fN2 interfaceC6285fN2;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new C6540gN2(this);
                }
                interfaceC6285fN2 = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6285fN2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC8744pN2 L() {
        InterfaceC8744pN2 interfaceC8744pN2;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new C8987qN2(this);
                }
                interfaceC8744pN2 = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8744pN2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC9479sN2 M() {
        InterfaceC9479sN2 interfaceC9479sN2;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new C9722tN2(this);
                }
                interfaceC9479sN2 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC9479sN2;
    }

    @Override // o.VU1
    public void d() {
        super.a();
        InterfaceC10528wh2 writableDatabase = super.m().getWritableDatabase();
        try {
            super.c();
            writableDatabase.K0("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.K0("DELETE FROM `Dependency`");
            writableDatabase.K0("DELETE FROM `WorkSpec`");
            writableDatabase.K0("DELETE FROM `WorkTag`");
            writableDatabase.K0("DELETE FROM `SystemIdInfo`");
            writableDatabase.K0("DELETE FROM `WorkName`");
            writableDatabase.K0("DELETE FROM `WorkProgress`");
            writableDatabase.K0("DELETE FROM `Preference`");
            super.A();
        } finally {
            super.i();
            writableDatabase.u4("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.W4()) {
                writableDatabase.K0("VACUUM");
            }
        }
    }

    @Override // o.VU1
    public c g() {
        return new c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // o.VU1
    public InterfaceC10771xh2 h(XU configuration) {
        return configuration.a.a(InterfaceC10771xh2.b.a(configuration.b).c(configuration.c).b(new XU1(configuration, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    /* loaded from: classes.dex */
    public class a extends XU1.a {
        public a(int version) {
            super(version);
        }

        @Override // o.XU1.a
        public void a(InterfaceC10528wh2 _db) {
            _db.K0("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            _db.K0("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            _db.K0("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            _db.K0(androidx.work.impl.a.m);
            _db.K0("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            _db.K0("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            _db.K0(androidx.work.impl.a.s);
            _db.K0(androidx.work.impl.a.w);
            _db.K0(WU1.f);
            _db.K0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // o.XU1.a
        public void b(InterfaceC10528wh2 _db) {
            _db.K0("DROP TABLE IF EXISTS `Dependency`");
            _db.K0("DROP TABLE IF EXISTS `WorkSpec`");
            _db.K0("DROP TABLE IF EXISTS `WorkTag`");
            _db.K0("DROP TABLE IF EXISTS `SystemIdInfo`");
            _db.K0("DROP TABLE IF EXISTS `WorkName`");
            _db.K0("DROP TABLE IF EXISTS `WorkProgress`");
            _db.K0("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((VU1.b) WorkDatabase_Impl.this.h.get(i)).b(_db);
                }
            }
        }

        @Override // o.XU1.a
        public void c(InterfaceC10528wh2 _db) {
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((VU1.b) WorkDatabase_Impl.this.h.get(i)).a(_db);
                }
            }
        }

        @Override // o.XU1.a
        public void d(InterfaceC10528wh2 _db) {
            WorkDatabase_Impl.this.a = _db;
            _db.K0("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.s(_db);
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((VU1.b) WorkDatabase_Impl.this.h.get(i)).c(_db);
                }
            }
        }

        @Override // o.XU1.a
        public void f(InterfaceC10528wh2 _db) {
            UT.b(_db);
        }

        @Override // o.XU1.a
        public XU1.b g(InterfaceC10528wh2 _db) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C3842Ok2.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C3842Ok2.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C3842Ok2.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C3842Ok2.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C3842Ok2 c3842Ok2 = new C3842Ok2("Dependency", hashMap, hashSet, hashSet2);
            C3842Ok2 a = C3842Ok2.a(_db, "Dependency");
            if (!c3842Ok2.equals(a)) {
                return new XU1.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c3842Ok2 + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C3842Ok2.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C3842Ok2.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C3842Ok2.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C3842Ok2.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C3842Ok2.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C3842Ok2.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C3842Ok2.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C3842Ok2.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C3842Ok2.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C3842Ok2.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C3842Ok2.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C3842Ok2.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new C3842Ok2.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C3842Ok2.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C3842Ok2.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C3842Ok2.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C3842Ok2.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new C3842Ok2.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new C3842Ok2.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C3842Ok2.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C3842Ok2.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C3842Ok2.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C3842Ok2.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C3842Ok2.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C3842Ok2.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C3842Ok2.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C3842Ok2.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C3842Ok2 c3842Ok22 = new C3842Ok2("WorkSpec", hashMap2, hashSet3, hashSet4);
            C3842Ok2 a2 = C3842Ok2.a(_db, "WorkSpec");
            if (!c3842Ok22.equals(a2)) {
                return new XU1.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c3842Ok22 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C3842Ok2.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C3842Ok2.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C3842Ok2.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C3842Ok2 c3842Ok23 = new C3842Ok2("WorkTag", hashMap3, hashSet5, hashSet6);
            C3842Ok2 a3 = C3842Ok2.a(_db, "WorkTag");
            if (!c3842Ok23.equals(a3)) {
                return new XU1.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c3842Ok23 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C3842Ok2.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new C3842Ok2.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3842Ok2 c3842Ok24 = new C3842Ok2("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C3842Ok2 a4 = C3842Ok2.a(_db, "SystemIdInfo");
            if (!c3842Ok24.equals(a4)) {
                return new XU1.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c3842Ok24 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C3842Ok2.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C3842Ok2.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C3842Ok2.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C3842Ok2 c3842Ok25 = new C3842Ok2("WorkName", hashMap5, hashSet8, hashSet9);
            C3842Ok2 a5 = C3842Ok2.a(_db, "WorkName");
            if (!c3842Ok25.equals(a5)) {
                return new XU1.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c3842Ok25 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C3842Ok2.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C3842Ok2.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C3842Ok2.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3842Ok2 c3842Ok26 = new C3842Ok2("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C3842Ok2 a6 = C3842Ok2.a(_db, "WorkProgress");
            if (!c3842Ok26.equals(a6)) {
                return new XU1.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c3842Ok26 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C3842Ok2.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C3842Ok2.a("long_value", "INTEGER", false, 0, null, 1));
            C3842Ok2 c3842Ok27 = new C3842Ok2("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C3842Ok2 a7 = C3842Ok2.a(_db, "Preference");
            if (!c3842Ok27.equals(a7)) {
                return new XU1.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c3842Ok27 + "\n Found:\n" + a7);
            }
            return new XU1.b(true, null);
        }

        @Override // o.XU1.a
        public void e(InterfaceC10528wh2 _db) {
        }
    }
}
