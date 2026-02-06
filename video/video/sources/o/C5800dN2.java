package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5800dN2 implements InterfaceC5557cN2 {
    public final VU1 a;
    public final AbstractC2430Ad0<C5315bN2> b;

    /* renamed from: o.dN2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C5315bN2> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C5315bN2 value) {
            String str = value.a;
            if (str == null) {
                stmt.O4(1);
            } else {
                stmt.r3(1, str);
            }
            String str2 = value.b;
            if (str2 == null) {
                stmt.O4(2);
            } else {
                stmt.r3(2, str2);
            }
        }
    }

    public C5800dN2(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // o.InterfaceC5557cN2
    public List<String> a(final String workSpecId) {
        YU1 h = YU1.h("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (workSpecId == null) {
            h.O4(1);
        } else {
            h.r3(1, workSpecId);
        }
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

    @Override // o.InterfaceC5557cN2
    public List<String> b(final String name) {
        YU1 h = YU1.h("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (name == null) {
            h.O4(1);
        } else {
            h.r3(1, name);
        }
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

    @Override // o.InterfaceC5557cN2
    public void c(final C5315bN2 workName) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workName);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}
