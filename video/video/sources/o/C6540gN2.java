package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.gN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6540gN2 implements InterfaceC6285fN2 {
    public final VU1 a;
    public final AbstractC2430Ad0<C6042eN2> b;
    public final AbstractC6950i42 c;
    public final AbstractC6950i42 d;

    /* renamed from: o.gN2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C6042eN2> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C6042eN2 value) {
            String str = value.a;
            if (str == null) {
                stmt.O4(1);
            } else {
                stmt.r3(1, str);
            }
            byte[] F = androidx.work.b.F(value.b);
            if (F == null) {
                stmt.O4(2);
            } else {
                stmt.p4(2, F);
            }
        }
    }

    /* renamed from: o.gN2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC6950i42 {
        public b(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: o.gN2$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC6950i42 {
        public c(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C6540gN2(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
        this.d = new c(__db);
    }

    @Override // o.InterfaceC6285fN2
    public void a(final String workSpecId) {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.c.a();
        if (workSpecId == null) {
            a2.O4(1);
        } else {
            a2.r3(1, workSpecId);
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

    @Override // o.InterfaceC6285fN2
    public androidx.work.b b(final String workSpecId) {
        YU1 h = YU1.h("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            h.O4(1);
        } else {
            h.r3(1, workSpecId);
        }
        this.a.b();
        androidx.work.b bVar = null;
        Cursor d = UT.d(this.a, h, false, null);
        try {
            if (d.moveToFirst()) {
                bVar = androidx.work.b.m(d.getBlob(0));
            }
            return bVar;
        } finally {
            d.close();
            h.g();
        }
    }

    @Override // o.InterfaceC6285fN2
    public void c() {
        this.a.b();
        InterfaceC2546Bh2 a2 = this.d.a();
        this.a.c();
        try {
            a2.T0();
            this.a.A();
        } finally {
            this.a.i();
            this.d.f(a2);
        }
    }

    @Override // o.InterfaceC6285fN2
    public void d(final C6042eN2 progress) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(progress);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC6285fN2
    public List<androidx.work.b> e(final List<String> workSpecIds) {
        StringBuilder c2 = C4209Se2.c();
        c2.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        int size = workSpecIds.size();
        C4209Se2.a(c2, size);
        c2.append(C9811tl1.d);
        YU1 h = YU1.h(c2.toString(), size);
        int i = 1;
        for (String str : workSpecIds) {
            if (str == null) {
                h.O4(i);
            } else {
                h.r3(i, str);
            }
            i++;
        }
        this.a.b();
        Cursor d = UT.d(this.a, h, false, null);
        try {
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                arrayList.add(androidx.work.b.m(d.getBlob(0)));
            }
            return arrayList;
        } finally {
            d.close();
            h.g();
        }
    }
}
