package o;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import o.C8501oN2;
import o.TM2;

/* renamed from: o.qN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8987qN2 implements InterfaceC8744pN2 {
    public final VU1 a;
    public final AbstractC2430Ad0<C8501oN2> b;
    public final AbstractC6950i42 c;
    public final AbstractC6950i42 d;
    public final AbstractC6950i42 e;
    public final AbstractC6950i42 f;
    public final AbstractC6950i42 g;
    public final AbstractC6950i42 h;
    public final AbstractC6950i42 i;
    public final AbstractC6950i42 j;

    /* renamed from: o.qN2$a */
    /* loaded from: classes.dex */
    public class a implements Callable<List<String>> {
        public final /* synthetic */ YU1 a;

        public a(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<String> call() throws Exception {
            C8987qN2.this.a.c();
            try {
                Cursor d = UT.d(C8987qN2.this.a, this.a, false, null);
                ArrayList arrayList = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    arrayList.add(d.getString(0));
                }
                C8987qN2.this.a.A();
                d.close();
                return arrayList;
            } finally {
                C8987qN2.this.a.i();
            }
        }

        public void finalize() {
            this.a.g();
        }
    }

    /* renamed from: o.qN2$b */
    /* loaded from: classes.dex */
    public class b implements Callable<List<C8501oN2.c>> {
        public final /* synthetic */ YU1 a;

        public b(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C8501oN2.c> call() throws Exception {
            ArrayList arrayList;
            ArrayList arrayList2;
            C8987qN2.this.a.c();
            try {
                Cursor d = UT.d(C8987qN2.this.a, this.a, true, null);
                int c = C9982uS.c(d, "id");
                int c2 = C9982uS.c(d, "state");
                int c3 = C9982uS.c(d, "output");
                int c4 = C9982uS.c(d, "run_attempt_count");
                C2531Be c2531Be = new C2531Be();
                C2531Be c2531Be2 = new C2531Be();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) c2531Be.get(string)) == null) {
                            c2531Be.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) c2531Be2.get(string2)) == null) {
                            c2531Be2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                C8987qN2.this.J(c2531Be);
                C8987qN2.this.I(c2531Be2);
                ArrayList arrayList3 = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        arrayList = (ArrayList) c2531Be.get(d.getString(c));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!d.isNull(c)) {
                        arrayList2 = (ArrayList) c2531Be2.get(d.getString(c));
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    C8501oN2.c cVar = new C8501oN2.c();
                    cVar.a = d.getString(c);
                    cVar.b = C10208vN2.g(d.getInt(c2));
                    cVar.c = androidx.work.b.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList;
                    cVar.f = arrayList2;
                    arrayList3.add(cVar);
                }
                C8987qN2.this.a.A();
                d.close();
                return arrayList3;
            } finally {
                C8987qN2.this.a.i();
            }
        }

        public void finalize() {
            this.a.g();
        }
    }

    /* renamed from: o.qN2$c */
    /* loaded from: classes.dex */
    public class c implements Callable<List<C8501oN2.c>> {
        public final /* synthetic */ YU1 a;

        public c(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C8501oN2.c> call() throws Exception {
            ArrayList arrayList;
            ArrayList arrayList2;
            C8987qN2.this.a.c();
            try {
                Cursor d = UT.d(C8987qN2.this.a, this.a, true, null);
                int c = C9982uS.c(d, "id");
                int c2 = C9982uS.c(d, "state");
                int c3 = C9982uS.c(d, "output");
                int c4 = C9982uS.c(d, "run_attempt_count");
                C2531Be c2531Be = new C2531Be();
                C2531Be c2531Be2 = new C2531Be();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) c2531Be.get(string)) == null) {
                            c2531Be.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) c2531Be2.get(string2)) == null) {
                            c2531Be2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                C8987qN2.this.J(c2531Be);
                C8987qN2.this.I(c2531Be2);
                ArrayList arrayList3 = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        arrayList = (ArrayList) c2531Be.get(d.getString(c));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!d.isNull(c)) {
                        arrayList2 = (ArrayList) c2531Be2.get(d.getString(c));
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    C8501oN2.c cVar = new C8501oN2.c();
                    cVar.a = d.getString(c);
                    cVar.b = C10208vN2.g(d.getInt(c2));
                    cVar.c = androidx.work.b.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList;
                    cVar.f = arrayList2;
                    arrayList3.add(cVar);
                }
                C8987qN2.this.a.A();
                d.close();
                return arrayList3;
            } finally {
                C8987qN2.this.a.i();
            }
        }

        public void finalize() {
            this.a.g();
        }
    }

    /* renamed from: o.qN2$d */
    /* loaded from: classes.dex */
    public class d implements Callable<List<C8501oN2.c>> {
        public final /* synthetic */ YU1 a;

        public d(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<C8501oN2.c> call() throws Exception {
            ArrayList arrayList;
            ArrayList arrayList2;
            C8987qN2.this.a.c();
            try {
                Cursor d = UT.d(C8987qN2.this.a, this.a, true, null);
                int c = C9982uS.c(d, "id");
                int c2 = C9982uS.c(d, "state");
                int c3 = C9982uS.c(d, "output");
                int c4 = C9982uS.c(d, "run_attempt_count");
                C2531Be c2531Be = new C2531Be();
                C2531Be c2531Be2 = new C2531Be();
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        String string = d.getString(c);
                        if (((ArrayList) c2531Be.get(string)) == null) {
                            c2531Be.put(string, new ArrayList());
                        }
                    }
                    if (!d.isNull(c)) {
                        String string2 = d.getString(c);
                        if (((ArrayList) c2531Be2.get(string2)) == null) {
                            c2531Be2.put(string2, new ArrayList());
                        }
                    }
                }
                d.moveToPosition(-1);
                C8987qN2.this.J(c2531Be);
                C8987qN2.this.I(c2531Be2);
                ArrayList arrayList3 = new ArrayList(d.getCount());
                while (d.moveToNext()) {
                    if (!d.isNull(c)) {
                        arrayList = (ArrayList) c2531Be.get(d.getString(c));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!d.isNull(c)) {
                        arrayList2 = (ArrayList) c2531Be2.get(d.getString(c));
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    C8501oN2.c cVar = new C8501oN2.c();
                    cVar.a = d.getString(c);
                    cVar.b = C10208vN2.g(d.getInt(c2));
                    cVar.c = androidx.work.b.m(d.getBlob(c3));
                    cVar.d = d.getInt(c4);
                    cVar.e = arrayList;
                    cVar.f = arrayList2;
                    arrayList3.add(cVar);
                }
                C8987qN2.this.a.A();
                d.close();
                return arrayList3;
            } finally {
                C8987qN2.this.a.i();
            }
        }

        public void finalize() {
            this.a.g();
        }
    }

    /* renamed from: o.qN2$e */
    /* loaded from: classes.dex */
    public class e implements Callable<Long> {
        public final /* synthetic */ YU1 a;

        public e(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() throws Exception {
            Long l = null;
            Cursor d = UT.d(C8987qN2.this.a, this.a, false, null);
            try {
                if (d.moveToFirst() && !d.isNull(0)) {
                    l = Long.valueOf(d.getLong(0));
                }
                return l;
            } finally {
                d.close();
            }
        }

        public void finalize() {
            this.a.g();
        }
    }

    /* renamed from: o.qN2$f */
    /* loaded from: classes.dex */
    public class f extends AbstractC2430Ad0<C8501oN2> {
        public f(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C8501oN2 value) {
            String str = value.a;
            if (str == null) {
                stmt.O4(1);
            } else {
                stmt.r3(1, str);
            }
            stmt.g4(2, C10208vN2.j(value.b));
            String str2 = value.c;
            if (str2 == null) {
                stmt.O4(3);
            } else {
                stmt.r3(3, str2);
            }
            String str3 = value.d;
            if (str3 == null) {
                stmt.O4(4);
            } else {
                stmt.r3(4, str3);
            }
            byte[] F = androidx.work.b.F(value.e);
            if (F == null) {
                stmt.O4(5);
            } else {
                stmt.p4(5, F);
            }
            byte[] F2 = androidx.work.b.F(value.f);
            if (F2 == null) {
                stmt.O4(6);
            } else {
                stmt.p4(6, F2);
            }
            stmt.g4(7, value.g);
            stmt.g4(8, value.h);
            stmt.g4(9, value.i);
            stmt.g4(10, value.k);
            stmt.g4(11, C10208vN2.a(value.l));
            stmt.g4(12, value.m);
            stmt.g4(13, value.n);
            stmt.g4(14, value.f826o);
            stmt.g4(15, value.p);
            stmt.g4(16, value.q ? 1L : 0L);
            stmt.g4(17, C10208vN2.i(value.r));
            XK xk = value.j;
            if (xk != null) {
                stmt.g4(18, C10208vN2.h(xk.b()));
                stmt.g4(19, xk.g() ? 1L : 0L);
                stmt.g4(20, xk.h() ? 1L : 0L);
                stmt.g4(21, xk.f() ? 1L : 0L);
                stmt.g4(22, xk.i() ? 1L : 0L);
                stmt.g4(23, xk.c());
                stmt.g4(24, xk.d());
                byte[] c = C10208vN2.c(xk.a());
                if (c == null) {
                    stmt.O4(25);
                    return;
                } else {
                    stmt.p4(25, c);
                    return;
                }
            }
            stmt.O4(18);
            stmt.O4(19);
            stmt.O4(20);
            stmt.O4(21);
            stmt.O4(22);
            stmt.O4(23);
            stmt.O4(24);
            stmt.O4(25);
        }
    }

    /* renamed from: o.qN2$g */
    /* loaded from: classes.dex */
    public class g extends AbstractC6950i42 {
        public g(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: o.qN2$h */
    /* loaded from: classes.dex */
    public class h extends AbstractC6950i42 {
        public h(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: o.qN2$i */
    /* loaded from: classes.dex */
    public class i extends AbstractC6950i42 {
        public i(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: o.qN2$j */
    /* loaded from: classes.dex */
    public class j extends AbstractC6950i42 {
        public j(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: o.qN2$k */
    /* loaded from: classes.dex */
    public class k extends AbstractC6950i42 {
        public k(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: o.qN2$l */
    /* loaded from: classes.dex */
    public class l extends AbstractC6950i42 {
        public l(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: o.qN2$m */
    /* loaded from: classes.dex */
    public class m extends AbstractC6950i42 {
        public m(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: o.qN2$n */
    /* loaded from: classes.dex */
    public class n extends AbstractC6950i42 {
        public n(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C8987qN2(VU1 __db) {
        this.a = __db;
        this.b = new f(__db);
        this.c = new g(__db);
        this.d = new h(__db);
        this.e = new i(__db);
        this.f = new j(__db);
        this.g = new k(__db);
        this.h = new l(__db);
        this.i = new m(__db);
        this.j = new n(__db);
    }

    @Override // o.InterfaceC8744pN2
    public boolean A() {
        boolean z = false;
        YU1 h2 = YU1.h("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            if (d2.moveToFirst()) {
                if (d2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public int B(final String id) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.g.a();
        if (id == null) {
            a2.O4(1);
        } else {
            a2.r3(1, id);
        }
        this.a.c();
        try {
            int T0 = a2.T0();
            this.a.A();
            return T0;
        } finally {
            this.a.i();
            this.g.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2.c> C(final String tag) {
        ArrayList<String> arrayList;
        ArrayList<androidx.work.b> arrayList2;
        YU1 h2 = YU1.h("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            h2.O4(1);
        } else {
            h2.r3(1, tag);
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = UT.d(this.a, h2, true, null);
            int c2 = C9982uS.c(d2, "id");
            int c3 = C9982uS.c(d2, "state");
            int c4 = C9982uS.c(d2, "output");
            int c5 = C9982uS.c(d2, "run_attempt_count");
            C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>();
            C2531Be<String, ArrayList<androidx.work.b>> c2531Be2 = new C2531Be<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (c2531Be.get(string) == null) {
                        c2531Be.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (c2531Be2.get(string2) == null) {
                        c2531Be2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(c2531Be);
            I(c2531Be2);
            ArrayList arrayList3 = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    arrayList = c2531Be.get(d2.getString(c2));
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!d2.isNull(c2)) {
                    arrayList2 = c2531Be2.get(d2.getString(c2));
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                C8501oN2.c cVar = new C8501oN2.c();
                cVar.a = d2.getString(c2);
                cVar.b = C10208vN2.g(d2.getInt(c3));
                cVar.c = androidx.work.b.m(d2.getBlob(c4));
                cVar.d = d2.getInt(c5);
                cVar.e = arrayList;
                cVar.f = arrayList2;
                arrayList3.add(cVar);
            }
            this.a.A();
            d2.close();
            h2.g();
            return arrayList3;
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public LiveData<List<C8501oN2.c>> D(final List<String> ids) {
        StringBuilder c2 = C4209Se2.c();
        c2.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        C4209Se2.a(c2, size);
        c2.append(C9811tl1.d);
        YU1 h2 = YU1.h(c2.toString(), size);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                h2.O4(i2);
            } else {
                h2.r3(i2, str);
            }
            i2++;
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new b(h2));
    }

    @Override // o.InterfaceC8744pN2
    public int E(final String id) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.f.a();
        if (id == null) {
            a2.O4(1);
        } else {
            a2.r3(1, id);
        }
        this.a.c();
        try {
            int T0 = a2.T0();
            this.a.A();
            return T0;
        } finally {
            this.a.i();
            this.f.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public void F(final String id, final long periodStartTime) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.e.a();
        a2.g4(1, periodStartTime);
        if (id == null) {
            a2.O4(2);
        } else {
            a2.r3(2, id);
        }
        this.a.c();
        try {
            a2.T0();
            this.a.A();
        } finally {
            this.a.i();
            this.e.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2.c> G(final List<String> ids) {
        ArrayList<String> arrayList;
        ArrayList<androidx.work.b> arrayList2;
        StringBuilder c2 = C4209Se2.c();
        c2.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = ids.size();
        C4209Se2.a(c2, size);
        c2.append(C9811tl1.d);
        YU1 h2 = YU1.h(c2.toString(), size);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                h2.O4(i2);
            } else {
                h2.r3(i2, str);
            }
            i2++;
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = UT.d(this.a, h2, true, null);
            int c3 = C9982uS.c(d2, "id");
            int c4 = C9982uS.c(d2, "state");
            int c5 = C9982uS.c(d2, "output");
            int c6 = C9982uS.c(d2, "run_attempt_count");
            C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>();
            C2531Be<String, ArrayList<androidx.work.b>> c2531Be2 = new C2531Be<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c3)) {
                    String string = d2.getString(c3);
                    if (c2531Be.get(string) == null) {
                        c2531Be.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c3)) {
                    String string2 = d2.getString(c3);
                    if (c2531Be2.get(string2) == null) {
                        c2531Be2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(c2531Be);
            I(c2531Be2);
            ArrayList arrayList3 = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (!d2.isNull(c3)) {
                    arrayList = c2531Be.get(d2.getString(c3));
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!d2.isNull(c3)) {
                    arrayList2 = c2531Be2.get(d2.getString(c3));
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                C8501oN2.c cVar = new C8501oN2.c();
                cVar.a = d2.getString(c3);
                cVar.b = C10208vN2.g(d2.getInt(c4));
                cVar.c = androidx.work.b.m(d2.getBlob(c5));
                cVar.d = d2.getInt(c6);
                cVar.e = arrayList;
                cVar.f = arrayList2;
                arrayList3.add(cVar);
            }
            this.a.A();
            d2.close();
            h2.g();
            return arrayList3;
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<String> H() {
        YU1 h2 = YU1.h("SELECT id FROM workspec", 0);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }

    public final void I(final C2531Be<String, ArrayList<androidx.work.b>> _map) {
        ArrayList<androidx.work.b> arrayList;
        Set<String> keySet = _map.keySet();
        if (!keySet.isEmpty()) {
            if (_map.size() > 999) {
                C2531Be<String, ArrayList<androidx.work.b>> c2531Be = new C2531Be<>(999);
                int size = _map.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    c2531Be.put(_map.g(i2), _map.l(i2));
                    i2++;
                    i3++;
                    if (i3 == 999) {
                        I(c2531Be);
                        c2531Be = new C2531Be<>(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    I(c2531Be);
                    return;
                }
                return;
            }
            StringBuilder c2 = C4209Se2.c();
            c2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C4209Se2.a(c2, size2);
            c2.append(C9811tl1.d);
            YU1 h2 = YU1.h(c2.toString(), size2);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    h2.O4(i4);
                } else {
                    h2.r3(i4, str);
                }
                i4++;
            }
            Cursor d2 = UT.d(this.a, h2, false, null);
            try {
                int b2 = C9982uS.b(d2, "work_spec_id");
                if (b2 == -1) {
                    return;
                }
                while (d2.moveToNext()) {
                    if (!d2.isNull(b2) && (arrayList = _map.get(d2.getString(b2))) != null) {
                        arrayList.add(androidx.work.b.m(d2.getBlob(0)));
                    }
                }
            } finally {
                d2.close();
            }
        }
    }

    public final void J(final C2531Be<String, ArrayList<String>> _map) {
        ArrayList<String> arrayList;
        Set<String> keySet = _map.keySet();
        if (!keySet.isEmpty()) {
            if (_map.size() > 999) {
                C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>(999);
                int size = _map.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    c2531Be.put(_map.g(i2), _map.l(i2));
                    i2++;
                    i3++;
                    if (i3 == 999) {
                        J(c2531Be);
                        c2531Be = new C2531Be<>(999);
                        i3 = 0;
                    }
                }
                if (i3 > 0) {
                    J(c2531Be);
                    return;
                }
                return;
            }
            StringBuilder c2 = C4209Se2.c();
            c2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size2 = keySet.size();
            C4209Se2.a(c2, size2);
            c2.append(C9811tl1.d);
            YU1 h2 = YU1.h(c2.toString(), size2);
            int i4 = 1;
            for (String str : keySet) {
                if (str == null) {
                    h2.O4(i4);
                } else {
                    h2.r3(i4, str);
                }
                i4++;
            }
            Cursor d2 = UT.d(this.a, h2, false, null);
            try {
                int b2 = C9982uS.b(d2, "work_spec_id");
                if (b2 == -1) {
                    return;
                }
                while (d2.moveToNext()) {
                    if (!d2.isNull(b2) && (arrayList = _map.get(d2.getString(b2))) != null) {
                        arrayList.add(d2.getString(0));
                    }
                }
            } finally {
                d2.close();
            }
        }
    }

    @Override // o.InterfaceC8744pN2
    public void a(final String id) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.c.a();
        if (id == null) {
            a2.O4(1);
        } else {
            a2.r3(1, id);
        }
        this.a.c();
        try {
            a2.T0();
            this.a.A();
        } finally {
            this.a.i();
            this.c.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public void b(final C8501oN2 workSpec) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workSpec);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public void c() {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.j.a();
        this.a.c();
        try {
            a2.T0();
            this.a.A();
        } finally {
            this.a.i();
            this.j.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2> d(final long startingAt) {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        h2.g4(1, startingAt);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c16 = C9982uS.c(d2, "initial_delay");
            int c17 = C9982uS.c(d2, "interval_duration");
            int c18 = C9982uS.c(d2, "flex_duration");
            int c19 = C9982uS.c(d2, "run_attempt_count");
            int c20 = C9982uS.c(d2, "backoff_policy");
            int c21 = C9982uS.c(d2, "backoff_delay_duration");
            int c22 = C9982uS.c(d2, "period_start_time");
            int c23 = C9982uS.c(d2, "minimum_retention_duration");
            int c24 = C9982uS.c(d2, "schedule_requested_at");
            int c25 = C9982uS.c(d2, "run_in_foreground");
            int c26 = C9982uS.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                XK xk = new XK();
                int i5 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i6 = c3;
                int i7 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                int i8 = i2;
                c8501oN2.f = androidx.work.b.m(d2.getBlob(i8));
                int i9 = c16;
                i2 = i8;
                c8501oN2.g = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c19;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c20;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c22;
                c8501oN2.n = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                c8501oN2.f826o = d2.getLong(i18);
                int i19 = c24;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c25;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c26;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                arrayList.add(c8501oN2);
                c21 = i16;
                c5 = i12;
                c20 = i15;
                c3 = i6;
                c26 = i21;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
            }
            d2.close();
            yu1.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2> e() {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c16 = C9982uS.c(d2, "initial_delay");
            int c17 = C9982uS.c(d2, "interval_duration");
            int c18 = C9982uS.c(d2, "flex_duration");
            int c19 = C9982uS.c(d2, "run_attempt_count");
            int c20 = C9982uS.c(d2, "backoff_policy");
            int c21 = C9982uS.c(d2, "backoff_delay_duration");
            int c22 = C9982uS.c(d2, "period_start_time");
            int c23 = C9982uS.c(d2, "minimum_retention_duration");
            int c24 = C9982uS.c(d2, "schedule_requested_at");
            int c25 = C9982uS.c(d2, "run_in_foreground");
            int c26 = C9982uS.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                XK xk = new XK();
                int i5 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i6 = c3;
                int i7 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                int i8 = i2;
                c8501oN2.f = androidx.work.b.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                c8501oN2.g = d2.getLong(i9);
                int i10 = c14;
                int i11 = c17;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c19;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c20;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c22;
                c8501oN2.n = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                c8501oN2.f826o = d2.getLong(i18);
                int i19 = c24;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c25;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c26;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                arrayList.add(c8501oN2);
                c21 = i16;
                c5 = i12;
                c20 = i15;
                c26 = i21;
                c3 = i6;
                c14 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
            }
            d2.close();
            yu1.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public C8501oN2[] f(final List<String> ids) {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        StringBuilder c16 = C4209Se2.c();
        c16.append("SELECT ");
        c16.append("*");
        c16.append(" FROM workspec WHERE id IN (");
        int size = ids.size();
        C4209Se2.a(c16, size);
        c16.append(C9811tl1.d);
        YU1 h2 = YU1.h(c16.toString(), size);
        int i2 = 1;
        for (String str : ids) {
            if (str == null) {
                h2.O4(i2);
            } else {
                h2.r3(i2, str);
            }
            i2++;
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c17 = C9982uS.c(d2, "initial_delay");
            int c18 = C9982uS.c(d2, "interval_duration");
            int c19 = C9982uS.c(d2, "flex_duration");
            int c20 = C9982uS.c(d2, "run_attempt_count");
            int c21 = C9982uS.c(d2, "backoff_policy");
            int c22 = C9982uS.c(d2, "backoff_delay_duration");
            int c23 = C9982uS.c(d2, "period_start_time");
            int c24 = C9982uS.c(d2, "minimum_retention_duration");
            int c25 = C9982uS.c(d2, "schedule_requested_at");
            int c26 = C9982uS.c(d2, "run_in_foreground");
            int c27 = C9982uS.c(d2, "out_of_quota_policy");
            C8501oN2[] c8501oN2Arr = new C8501oN2[d2.getCount()];
            int i3 = 0;
            while (d2.moveToNext()) {
                C8501oN2[] c8501oN2Arr2 = c8501oN2Arr;
                String string = d2.getString(c10);
                int i4 = c10;
                String string2 = d2.getString(c12);
                int i5 = c12;
                XK xk = new XK();
                int i6 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i7 = c3;
                int i8 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                c8501oN2.f = androidx.work.b.m(d2.getBlob(c15));
                int i9 = c15;
                int i10 = c17;
                c8501oN2.g = d2.getLong(i10);
                c17 = i10;
                int i11 = c18;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c13;
                int i13 = c19;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c20;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c21;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c19 = i13;
                int i16 = c22;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c23;
                c8501oN2.n = d2.getLong(i17);
                c23 = i17;
                int i18 = c24;
                c8501oN2.f826o = d2.getLong(i18);
                c24 = i18;
                int i19 = c25;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c26;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c27;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                c8501oN2Arr2[i3] = c8501oN2;
                i3++;
                c22 = i16;
                c13 = i12;
                c18 = i11;
                c20 = i14;
                c21 = i15;
                c27 = i21;
                c3 = i7;
                c25 = i19;
                c8501oN2Arr = c8501oN2Arr2;
                c10 = i4;
                c12 = i5;
                c2 = i6;
                c26 = i20;
                c15 = i9;
                c4 = i8;
            }
            C8501oN2[] c8501oN2Arr3 = c8501oN2Arr;
            d2.close();
            yu1.g();
            return c8501oN2Arr3;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<String> g(final String name) {
        YU1 h2 = YU1.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            h2.O4(1);
        } else {
            h2.r3(1, name);
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public C8501oN2.c h(final String id) {
        ArrayList<String> arrayList;
        YU1 h2 = YU1.h("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (id == null) {
            h2.O4(1);
        } else {
            h2.r3(1, id);
        }
        this.a.b();
        this.a.c();
        try {
            C8501oN2.c cVar = null;
            ArrayList<androidx.work.b> arrayList2 = null;
            Cursor d2 = UT.d(this.a, h2, true, null);
            int c2 = C9982uS.c(d2, "id");
            int c3 = C9982uS.c(d2, "state");
            int c4 = C9982uS.c(d2, "output");
            int c5 = C9982uS.c(d2, "run_attempt_count");
            C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>();
            C2531Be<String, ArrayList<androidx.work.b>> c2531Be2 = new C2531Be<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (c2531Be.get(string) == null) {
                        c2531Be.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (c2531Be2.get(string2) == null) {
                        c2531Be2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(c2531Be);
            I(c2531Be2);
            if (d2.moveToFirst()) {
                if (!d2.isNull(c2)) {
                    arrayList = c2531Be.get(d2.getString(c2));
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!d2.isNull(c2)) {
                    arrayList2 = c2531Be2.get(d2.getString(c2));
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                C8501oN2.c cVar2 = new C8501oN2.c();
                cVar2.a = d2.getString(c2);
                cVar2.b = C10208vN2.g(d2.getInt(c3));
                cVar2.c = androidx.work.b.m(d2.getBlob(c4));
                cVar2.d = d2.getInt(c5);
                cVar2.e = arrayList;
                cVar2.f = arrayList2;
                cVar = cVar2;
            }
            this.a.A();
            d2.close();
            h2.g();
            return cVar;
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public TM2.a i(final String id) {
        YU1 h2 = YU1.h("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            h2.O4(1);
        } else {
            h2.r3(1, id);
        }
        this.a.b();
        TM2.a aVar = null;
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            if (d2.moveToFirst()) {
                aVar = C10208vN2.g(d2.getInt(0));
            }
            return aVar;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public C8501oN2 j(final String id) {
        YU1 yu1;
        C8501oN2 c8501oN2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (id == null) {
            h2.O4(1);
        } else {
            h2.r3(1, id);
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            int c2 = C9982uS.c(d2, "required_network_type");
            int c3 = C9982uS.c(d2, "requires_charging");
            int c4 = C9982uS.c(d2, "requires_device_idle");
            int c5 = C9982uS.c(d2, "requires_battery_not_low");
            int c6 = C9982uS.c(d2, "requires_storage_not_low");
            int c7 = C9982uS.c(d2, "trigger_content_update_delay");
            int c8 = C9982uS.c(d2, "trigger_max_content_delay");
            int c9 = C9982uS.c(d2, "content_uri_triggers");
            int c10 = C9982uS.c(d2, "id");
            int c11 = C9982uS.c(d2, "state");
            int c12 = C9982uS.c(d2, "worker_class_name");
            int c13 = C9982uS.c(d2, "input_merger_class_name");
            int c14 = C9982uS.c(d2, "input");
            int c15 = C9982uS.c(d2, "output");
            yu1 = h2;
            try {
                int c16 = C9982uS.c(d2, "initial_delay");
                int c17 = C9982uS.c(d2, "interval_duration");
                int c18 = C9982uS.c(d2, "flex_duration");
                int c19 = C9982uS.c(d2, "run_attempt_count");
                int c20 = C9982uS.c(d2, "backoff_policy");
                int c21 = C9982uS.c(d2, "backoff_delay_duration");
                int c22 = C9982uS.c(d2, "period_start_time");
                int c23 = C9982uS.c(d2, "minimum_retention_duration");
                int c24 = C9982uS.c(d2, "schedule_requested_at");
                int c25 = C9982uS.c(d2, "run_in_foreground");
                int c26 = C9982uS.c(d2, "out_of_quota_policy");
                if (d2.moveToFirst()) {
                    String string = d2.getString(c10);
                    String string2 = d2.getString(c12);
                    XK xk = new XK();
                    xk.k(C10208vN2.e(d2.getInt(c2)));
                    if (d2.getInt(c3) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xk.m(z);
                    if (d2.getInt(c4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xk.n(z2);
                    if (d2.getInt(c5) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    xk.l(z3);
                    if (d2.getInt(c6) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xk.o(z4);
                    xk.p(d2.getLong(c7));
                    xk.q(d2.getLong(c8));
                    xk.j(C10208vN2.b(d2.getBlob(c9)));
                    C8501oN2 c8501oN22 = new C8501oN2(string, string2);
                    c8501oN22.b = C10208vN2.g(d2.getInt(c11));
                    c8501oN22.d = d2.getString(c13);
                    c8501oN22.e = androidx.work.b.m(d2.getBlob(c14));
                    c8501oN22.f = androidx.work.b.m(d2.getBlob(c15));
                    c8501oN22.g = d2.getLong(c16);
                    c8501oN22.h = d2.getLong(c17);
                    c8501oN22.i = d2.getLong(c18);
                    c8501oN22.k = d2.getInt(c19);
                    c8501oN22.l = C10208vN2.d(d2.getInt(c20));
                    c8501oN22.m = d2.getLong(c21);
                    c8501oN22.n = d2.getLong(c22);
                    c8501oN22.f826o = d2.getLong(c23);
                    c8501oN22.p = d2.getLong(c24);
                    if (d2.getInt(c25) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c8501oN22.q = z5;
                    c8501oN22.r = C10208vN2.f(d2.getInt(c26));
                    c8501oN22.j = xk;
                    c8501oN2 = c8501oN22;
                } else {
                    c8501oN2 = null;
                }
                d2.close();
                yu1.g();
                return c8501oN2;
            } catch (Throwable th) {
                th = th;
                d2.close();
                yu1.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            yu1 = h2;
        }
    }

    @Override // o.InterfaceC8744pN2
    public LiveData<Long> k(final String id) {
        YU1 h2 = YU1.h("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id == null) {
            h2.O4(1);
        } else {
            h2.r3(1, id);
        }
        return this.a.l().e(new String[]{"workspec"}, false, new e(h2));
    }

    @Override // o.InterfaceC8744pN2
    public List<String> l(final String tag) {
        YU1 h2 = YU1.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            h2.O4(1);
        } else {
            h2.r3(1, tag);
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<androidx.work.b> m(final String id) {
        YU1 h2 = YU1.h("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id == null) {
            h2.O4(1);
        } else {
            h2.r3(1, id);
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(androidx.work.b.m(d2.getBlob(0)));
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2.c> n(final String name) {
        ArrayList<String> arrayList;
        ArrayList<androidx.work.b> arrayList2;
        YU1 h2 = YU1.h("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            h2.O4(1);
        } else {
            h2.r3(1, name);
        }
        this.a.b();
        this.a.c();
        try {
            Cursor d2 = UT.d(this.a, h2, true, null);
            int c2 = C9982uS.c(d2, "id");
            int c3 = C9982uS.c(d2, "state");
            int c4 = C9982uS.c(d2, "output");
            int c5 = C9982uS.c(d2, "run_attempt_count");
            C2531Be<String, ArrayList<String>> c2531Be = new C2531Be<>();
            C2531Be<String, ArrayList<androidx.work.b>> c2531Be2 = new C2531Be<>();
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    String string = d2.getString(c2);
                    if (c2531Be.get(string) == null) {
                        c2531Be.put(string, new ArrayList<>());
                    }
                }
                if (!d2.isNull(c2)) {
                    String string2 = d2.getString(c2);
                    if (c2531Be2.get(string2) == null) {
                        c2531Be2.put(string2, new ArrayList<>());
                    }
                }
            }
            d2.moveToPosition(-1);
            J(c2531Be);
            I(c2531Be2);
            ArrayList arrayList3 = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                if (!d2.isNull(c2)) {
                    arrayList = c2531Be.get(d2.getString(c2));
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!d2.isNull(c2)) {
                    arrayList2 = c2531Be2.get(d2.getString(c2));
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                C8501oN2.c cVar = new C8501oN2.c();
                cVar.a = d2.getString(c2);
                cVar.b = C10208vN2.g(d2.getInt(c3));
                cVar.c = androidx.work.b.m(d2.getBlob(c4));
                cVar.d = d2.getInt(c5);
                cVar.e = arrayList;
                cVar.f = arrayList2;
                arrayList3.add(cVar);
            }
            this.a.A();
            d2.close();
            h2.g();
            return arrayList3;
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2> o(final int maxLimit) {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        h2.g4(1, maxLimit);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c16 = C9982uS.c(d2, "initial_delay");
            int c17 = C9982uS.c(d2, "interval_duration");
            int c18 = C9982uS.c(d2, "flex_duration");
            int c19 = C9982uS.c(d2, "run_attempt_count");
            int c20 = C9982uS.c(d2, "backoff_policy");
            int c21 = C9982uS.c(d2, "backoff_delay_duration");
            int c22 = C9982uS.c(d2, "period_start_time");
            int c23 = C9982uS.c(d2, "minimum_retention_duration");
            int c24 = C9982uS.c(d2, "schedule_requested_at");
            int c25 = C9982uS.c(d2, "run_in_foreground");
            int c26 = C9982uS.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                XK xk = new XK();
                int i5 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i6 = c3;
                int i7 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                int i8 = i2;
                c8501oN2.f = androidx.work.b.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                c8501oN2.g = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c19;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c20;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c22;
                c8501oN2.n = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                c8501oN2.f826o = d2.getLong(i18);
                int i19 = c24;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c25;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c26;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                arrayList.add(c8501oN2);
                c21 = i16;
                c5 = i12;
                c20 = i15;
                c26 = i21;
                c3 = i6;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
            }
            d2.close();
            yu1.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public int p() {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.i.a();
        this.a.c();
        try {
            int T0 = a2.T0();
            this.a.A();
            return T0;
        } finally {
            this.a.i();
            this.i.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public int q(final String id, final long startTime) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.h.a();
        a2.g4(1, startTime);
        if (id == null) {
            a2.O4(2);
        } else {
            a2.r3(2, id);
        }
        this.a.c();
        try {
            int T0 = a2.T0();
            this.a.A();
            return T0;
        } finally {
            this.a.i();
            this.h.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2.b> r(final String name) {
        YU1 h2 = YU1.h("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            h2.O4(1);
        } else {
            h2.r3(1, name);
        }
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            int c2 = C9982uS.c(d2, "id");
            int c3 = C9982uS.c(d2, "state");
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                C8501oN2.b bVar = new C8501oN2.b();
                bVar.a = d2.getString(c2);
                bVar.b = C10208vN2.g(d2.getInt(c3));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2> s(final int schedulerLimit) {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        h2.g4(1, schedulerLimit);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c16 = C9982uS.c(d2, "initial_delay");
            int c17 = C9982uS.c(d2, "interval_duration");
            int c18 = C9982uS.c(d2, "flex_duration");
            int c19 = C9982uS.c(d2, "run_attempt_count");
            int c20 = C9982uS.c(d2, "backoff_policy");
            int c21 = C9982uS.c(d2, "backoff_delay_duration");
            int c22 = C9982uS.c(d2, "period_start_time");
            int c23 = C9982uS.c(d2, "minimum_retention_duration");
            int c24 = C9982uS.c(d2, "schedule_requested_at");
            int c25 = C9982uS.c(d2, "run_in_foreground");
            int c26 = C9982uS.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                XK xk = new XK();
                int i5 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i6 = c3;
                int i7 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                int i8 = i2;
                c8501oN2.f = androidx.work.b.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                c8501oN2.g = d2.getLong(i9);
                int i10 = c13;
                int i11 = c17;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c19;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c20;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c22;
                c8501oN2.n = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                c8501oN2.f826o = d2.getLong(i18);
                int i19 = c24;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c25;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c26;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                arrayList.add(c8501oN2);
                c21 = i16;
                c5 = i12;
                c20 = i15;
                c26 = i21;
                c3 = i6;
                c13 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
            }
            d2.close();
            yu1.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public int t(final TM2.a state, final String... ids) {
        this.a.b();
        StringBuilder c2 = C4209Se2.c();
        c2.append("UPDATE workspec SET state=");
        c2.append("?");
        c2.append(" WHERE id IN (");
        C4209Se2.a(c2, ids.length);
        c2.append(C9811tl1.d);
        InterfaceC2546Bh2 f2 = this.a.f(c2.toString());
        f2.g4(1, C10208vN2.j(state));
        int i2 = 2;
        for (String str : ids) {
            if (str == null) {
                f2.O4(i2);
            } else {
                f2.r3(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int T0 = f2.T0();
            this.a.A();
            return T0;
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8744pN2
    public void u(final String id, final androidx.work.b output) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.d.a();
        byte[] F = androidx.work.b.F(output);
        if (F == null) {
            a2.O4(1);
        } else {
            a2.p4(1, F);
        }
        if (id == null) {
            a2.O4(2);
        } else {
            a2.r3(2, id);
        }
        this.a.c();
        try {
            a2.T0();
            this.a.A();
        } finally {
            this.a.i();
            this.d.f(a2);
        }
    }

    @Override // o.InterfaceC8744pN2
    public LiveData<List<String>> v() {
        return this.a.l().e(new String[]{"workspec"}, true, new a(YU1.h("SELECT id FROM workspec", 0)));
    }

    @Override // o.InterfaceC8744pN2
    public LiveData<List<C8501oN2.c>> w(final String name) {
        YU1 h2 = YU1.h("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            h2.O4(1);
        } else {
            h2.r3(1, name);
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new d(h2));
    }

    @Override // o.InterfaceC8744pN2
    public List<C8501oN2> x() {
        YU1 yu1;
        int c2;
        int c3;
        int c4;
        int c5;
        int c6;
        int c7;
        int c8;
        int c9;
        int c10;
        int c11;
        int c12;
        int c13;
        int c14;
        int c15;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        YU1 h2 = YU1.h("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            c2 = C9982uS.c(d2, "required_network_type");
            c3 = C9982uS.c(d2, "requires_charging");
            c4 = C9982uS.c(d2, "requires_device_idle");
            c5 = C9982uS.c(d2, "requires_battery_not_low");
            c6 = C9982uS.c(d2, "requires_storage_not_low");
            c7 = C9982uS.c(d2, "trigger_content_update_delay");
            c8 = C9982uS.c(d2, "trigger_max_content_delay");
            c9 = C9982uS.c(d2, "content_uri_triggers");
            c10 = C9982uS.c(d2, "id");
            c11 = C9982uS.c(d2, "state");
            c12 = C9982uS.c(d2, "worker_class_name");
            c13 = C9982uS.c(d2, "input_merger_class_name");
            c14 = C9982uS.c(d2, "input");
            c15 = C9982uS.c(d2, "output");
            yu1 = h2;
        } catch (Throwable th) {
            th = th;
            yu1 = h2;
        }
        try {
            int c16 = C9982uS.c(d2, "initial_delay");
            int c17 = C9982uS.c(d2, "interval_duration");
            int c18 = C9982uS.c(d2, "flex_duration");
            int c19 = C9982uS.c(d2, "run_attempt_count");
            int c20 = C9982uS.c(d2, "backoff_policy");
            int c21 = C9982uS.c(d2, "backoff_delay_duration");
            int c22 = C9982uS.c(d2, "period_start_time");
            int c23 = C9982uS.c(d2, "minimum_retention_duration");
            int c24 = C9982uS.c(d2, "schedule_requested_at");
            int c25 = C9982uS.c(d2, "run_in_foreground");
            int c26 = C9982uS.c(d2, "out_of_quota_policy");
            int i2 = c15;
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                String string = d2.getString(c10);
                int i3 = c10;
                String string2 = d2.getString(c12);
                int i4 = c12;
                XK xk = new XK();
                int i5 = c2;
                xk.k(C10208vN2.e(d2.getInt(c2)));
                if (d2.getInt(c3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                xk.m(z);
                if (d2.getInt(c4) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xk.n(z2);
                if (d2.getInt(c5) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xk.l(z3);
                if (d2.getInt(c6) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xk.o(z4);
                int i6 = c3;
                int i7 = c4;
                xk.p(d2.getLong(c7));
                xk.q(d2.getLong(c8));
                xk.j(C10208vN2.b(d2.getBlob(c9)));
                C8501oN2 c8501oN2 = new C8501oN2(string, string2);
                c8501oN2.b = C10208vN2.g(d2.getInt(c11));
                c8501oN2.d = d2.getString(c13);
                c8501oN2.e = androidx.work.b.m(d2.getBlob(c14));
                int i8 = i2;
                c8501oN2.f = androidx.work.b.m(d2.getBlob(i8));
                i2 = i8;
                int i9 = c16;
                c8501oN2.g = d2.getLong(i9);
                int i10 = c14;
                int i11 = c17;
                c8501oN2.h = d2.getLong(i11);
                int i12 = c5;
                int i13 = c18;
                c8501oN2.i = d2.getLong(i13);
                int i14 = c19;
                c8501oN2.k = d2.getInt(i14);
                int i15 = c20;
                c8501oN2.l = C10208vN2.d(d2.getInt(i15));
                c18 = i13;
                int i16 = c21;
                c8501oN2.m = d2.getLong(i16);
                int i17 = c22;
                c8501oN2.n = d2.getLong(i17);
                c22 = i17;
                int i18 = c23;
                c8501oN2.f826o = d2.getLong(i18);
                int i19 = c24;
                c8501oN2.p = d2.getLong(i19);
                int i20 = c25;
                if (d2.getInt(i20) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c8501oN2.q = z5;
                int i21 = c26;
                c8501oN2.r = C10208vN2.f(d2.getInt(i21));
                c8501oN2.j = xk;
                arrayList.add(c8501oN2);
                c21 = i16;
                c5 = i12;
                c20 = i15;
                c26 = i21;
                c3 = i6;
                c14 = i10;
                c16 = i9;
                c17 = i11;
                c19 = i14;
                c24 = i19;
                c10 = i3;
                c12 = i4;
                c2 = i5;
                c25 = i20;
                c23 = i18;
                c4 = i7;
            }
            d2.close();
            yu1.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            d2.close();
            yu1.g();
            throw th;
        }
    }

    @Override // o.InterfaceC8744pN2
    public LiveData<List<C8501oN2.c>> y(final String tag) {
        YU1 h2 = YU1.h("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            h2.O4(1);
        } else {
            h2.r3(1, tag);
        }
        return this.a.l().e(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new c(h2));
    }

    @Override // o.InterfaceC8744pN2
    public List<String> z() {
        YU1 h2 = YU1.h("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor d2 = UT.d(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(d2.getCount());
            while (d2.moveToNext()) {
                arrayList.add(d2.getString(0));
            }
            return arrayList;
        } finally {
            d2.close();
            h2.g();
        }
    }
}
