package o;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.tN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9722tN2 implements InterfaceC9479sN2 {
    public final VU1 a;
    public final AbstractC2430Ad0<C9236rN2> b;

    /* renamed from: o.tN2$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C9236rN2> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C9236rN2 value) {
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

    public C9722tN2(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // o.InterfaceC9479sN2
    public void a(final C9236rN2 workTag) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(workTag);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC9479sN2
    public List<String> b(final String id) {
        YU1 h = YU1.h("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // o.InterfaceC9479sN2
    public List<String> c(final String tag) {
        YU1 h = YU1.h("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
        if (tag == null) {
            h.O4(1);
        } else {
            h.r3(1, tag);
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
