package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.uk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10051uk2 implements InterfaceC9808tk2 {
    public final VU1 a;
    public final AbstractC2430Ad0<C9565sk2> b;
    public final AbstractC6950i42 c;

    /* renamed from: o.uk2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C9565sk2> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C9565sk2 value) {
            String str = value.a;
            if (str == null) {
                stmt.O4(1);
            } else {
                stmt.r3(1, str);
            }
            stmt.g4(2, value.b);
        }
    }

    /* renamed from: o.uk2$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC6950i42 {
        public b(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C10051uk2(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
        this.c = new b(__db);
    }

    @Override // o.InterfaceC9808tk2
    public C9565sk2 a(final String workSpecId) {
        YU1 h = YU1.h("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            h.O4(1);
        } else {
            h.r3(1, workSpecId);
        }
        this.a.b();
        C9565sk2 c9565sk2 = null;
        Cursor d = UT.d(this.a, h, false, null);
        try {
            int c = C9982uS.c(d, "work_spec_id");
            int c2 = C9982uS.c(d, "system_id");
            if (d.moveToFirst()) {
                c9565sk2 = new C9565sk2(d.getString(c), d.getInt(c2));
            }
            return c9565sk2;
        } finally {
            d.close();
            h.g();
        }
    }

    @Override // o.InterfaceC9808tk2
    public List<String> b() {
        YU1 h = YU1.h("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.b();
        Cursor d = UT.d(this.a, h, false, null);
        try {
            ArrayList arrayList = new ArrayList(d.getCount());
            while (d.moveToNext()) {
                arrayList.add(d.getString(0));
            }
            return arrayList;
        } finally {
            d.close();
            h.g();
        }
    }

    @Override // o.InterfaceC9808tk2
    public void c(final C9565sk2 systemIdInfo) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(systemIdInfo);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC9808tk2
    public void d(final String workSpecId) {
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
}
