package androidx.work.impl;

import android.content.Context;
import o.AbstractC3739Nj1;
import o.C10425wG1;
import o.InterfaceC10528wh2;
import o.OL0;

/* loaded from: classes.dex */
public class a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final String m = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    public static final String n = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";

    /* renamed from: o  reason: collision with root package name */
    public static final String f67o = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
    public static final String p = "DROP TABLE IF EXISTS alarmInfo";
    public static final String q = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";
    public static final String r = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    public static final String s = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    public static final String t = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
    public static final String u = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    public static final String v = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final String w = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    public static final String x = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    public static AbstractC3739Nj1 y = new C0055a(1, 2);
    public static AbstractC3739Nj1 z = new b(3, 4);
    public static AbstractC3739Nj1 A = new c(4, 5);
    public static AbstractC3739Nj1 B = new d(6, 7);
    public static AbstractC3739Nj1 C = new e(7, 8);
    public static AbstractC3739Nj1 D = new f(8, 9);
    public static AbstractC3739Nj1 E = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0055a extends AbstractC3739Nj1 {
        public C0055a(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.m);
            database.K0(a.n);
            database.K0(a.p);
            database.K0("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractC3739Nj1 {
        public b(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.f67o);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractC3739Nj1 {
        public c(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.q);
            database.K0(a.r);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractC3739Nj1 {
        public d(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.s);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AbstractC3739Nj1 {
        public e(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.t);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractC3739Nj1 {
        public f(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.u);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AbstractC3739Nj1 {
        public g(int startVersion, int endVersion) {
            super(startVersion, endVersion);
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.x);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends AbstractC3739Nj1 {
        public final Context c;

        public h(Context context, int startVersion, int endVersion) {
            super(startVersion, endVersion);
            this.c = context;
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            if (this.b >= 10) {
                database.u1(a.v, new Object[]{C10425wG1.d, 1});
            } else {
                this.c.getSharedPreferences(C10425wG1.b, 0).edit().putBoolean(C10425wG1.d, true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends AbstractC3739Nj1 {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // o.AbstractC3739Nj1
        public void a(InterfaceC10528wh2 database) {
            database.K0(a.w);
            C10425wG1.d(this.c, database);
            OL0.a(this.c, database);
        }
    }
}
