package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.o20  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8414o20 implements InterfaceC8171n20 {
    public final VU1 a;
    public final AbstractC2430Ad0<C7667l20> b;

    /* renamed from: o.o20$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C7667l20> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C7667l20 value) {
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

    public C8414o20(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // o.InterfaceC8171n20
    public List<String> a(final String id) {
        YU1 h = YU1.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            h.O4(1);
        } else {
            h.r3(1, id);
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

    @Override // o.InterfaceC8171n20
    public boolean b(final String id) {
        boolean z = true;
        YU1 h = YU1.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (id == null) {
            h.O4(1);
        } else {
            h.r3(1, id);
        }
        this.a.b();
        boolean z2 = false;
        Cursor d = UT.d(this.a, h, false, null);
        try {
            if (d.moveToFirst()) {
                if (d.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            d.close();
            h.g();
        }
    }

    @Override // o.InterfaceC8171n20
    public boolean c(final String id) {
        boolean z = true;
        YU1 h = YU1.h("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            h.O4(1);
        } else {
            h.r3(1, id);
        }
        this.a.b();
        boolean z2 = false;
        Cursor d = UT.d(this.a, h, false, null);
        try {
            if (d.moveToFirst()) {
                if (d.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            d.close();
            h.g();
        }
    }

    @Override // o.InterfaceC8171n20
    public void d(final C7667l20 dependency) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(dependency);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8171n20
    public List<String> e(final String id) {
        YU1 h = YU1.h("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (id == null) {
            h.O4(1);
        } else {
            h.r3(1, id);
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
}
