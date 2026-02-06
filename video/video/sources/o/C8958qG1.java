package o;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Callable;

/* renamed from: o.qG1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8958qG1 implements InterfaceC8715pG1 {
    public final VU1 a;
    public final AbstractC2430Ad0<C8472oG1> b;

    /* renamed from: o.qG1$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2430Ad0<C8472oG1> {
        public a(VU1 database) {
            super(database);
        }

        @Override // o.AbstractC6950i42
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // o.AbstractC2430Ad0
        /* renamed from: r */
        public void g(InterfaceC2546Bh2 stmt, C8472oG1 value) {
            String str = value.a;
            if (str == null) {
                stmt.O4(1);
            } else {
                stmt.r3(1, str);
            }
            Long l = value.b;
            if (l == null) {
                stmt.O4(2);
            } else {
                stmt.g4(2, l.longValue());
            }
        }
    }

    /* renamed from: o.qG1$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Long> {
        public final /* synthetic */ YU1 a;

        public b(final YU1 val$_statement) {
            this.a = val$_statement;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() throws Exception {
            Long l = null;
            Cursor d = UT.d(C8958qG1.this.a, this.a, false, null);
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

    public C8958qG1(VU1 __db) {
        this.a = __db;
        this.b = new a(__db);
    }

    @Override // o.InterfaceC8715pG1
    public LiveData<Long> a(final String key) {
        YU1 h = YU1.h("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            h.O4(1);
        } else {
            h.r3(1, key);
        }
        return this.a.l().e(new String[]{"Preference"}, false, new b(h));
    }

    @Override // o.InterfaceC8715pG1
    public void b(final C8472oG1 preference) {
        this.a.b();
        this.a.c();
        try {
            this.b.i(preference);
            this.a.A();
        } finally {
            this.a.i();
        }
    }

    @Override // o.InterfaceC8715pG1
    public Long c(final String key) {
        YU1 h = YU1.h("SELECT long_value FROM Preference where `key`=?", 1);
        if (key == null) {
            h.O4(1);
        } else {
            h.r3(1, key);
        }
        this.a.b();
        Long l = null;
        Cursor d = UT.d(this.a, h, false, null);
        try {
            if (d.moveToFirst() && !d.isNull(0)) {
                l = Long.valueOf(d.getLong(0));
            }
            return l;
        } finally {
            d.close();
            h.g();
        }
    }
}
