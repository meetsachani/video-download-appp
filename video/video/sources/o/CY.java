package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o.C5972e60;

@Deprecated
/* loaded from: classes2.dex */
public final class CY implements LN2 {
    public static final int A = 4;
    public static final int B = 5;
    public static final int C = 6;
    public static final int D = 7;
    public static final int E = 8;
    public static final int F = 9;
    public static final int G = 10;
    public static final int H = 11;
    public static final int I = 12;
    public static final int J = 13;
    public static final int K = 14;
    public static final String L = "id = ?";
    public static final String M = "state = 2";
    public static final String P = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    public static final String Q = "1";
    public static final String f = "ExoPlayerDownloads";
    @InterfaceC5056aJ2
    public static final int g = 3;
    public static final String h = "id";
    public static final String j = "uri";
    public static final String m = "data";
    public static final String n = "state";
    public static final String r = "stop_reason";
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;
    public final String a;
    public final String b;
    public final InterfaceC5100aV c;
    public final Object d;
    @InterfaceC8710pF0("initializationLock")
    public boolean e;
    public static final String N = p(3, 4);
    public static final String i = "mime_type";
    public static final String k = "stream_keys";
    public static final String l = "custom_cache_key";

    /* renamed from: o  reason: collision with root package name */
    public static final String f431o = "start_time_ms";
    public static final String p = "update_time_ms";
    public static final String q = "content_length";
    public static final String s = "failure_reason";
    public static final String t = "percent_downloaded";
    public static final String u = "bytes_downloaded";
    public static final String v = "key_set_id";
    public static final String[] O = {"id", i, "uri", k, l, "data", "state", f431o, p, q, "stop_reason", s, t, u, v};

    /* loaded from: classes2.dex */
    public static final class b implements I50 {
        public final Cursor X;

        @Override // o.I50, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.X.close();
        }

        @Override // o.I50
        public int getCount() {
            return this.X.getCount();
        }

        @Override // o.I50
        public int getPosition() {
            return this.X.getPosition();
        }

        @Override // o.I50
        public boolean isClosed() {
            return this.X.isClosed();
        }

        @Override // o.I50
        public boolean moveToPosition(int i) {
            return this.X.moveToPosition(i);
        }

        @Override // o.I50
        public G50 v2() {
            return CY.n(this.X);
        }

        public b(Cursor cursor) {
            this.X = cursor;
        }
    }

    public CY(InterfaceC5100aV interfaceC5100aV) {
        this(interfaceC5100aV, "");
    }

    public static List<C3031Gd2> j(@InterfaceC11300zs1 String str) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : TD2.J1(str, ",")) {
                String[] J1 = TD2.J1(str2, "\\.");
                if (J1.length == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C9542sf.i(z2);
                arrayList.add(new C3031Gd2(Integer.parseInt(J1[0]), Integer.parseInt(J1[1]), Integer.parseInt(J1[2])));
            }
        }
        return arrayList;
    }

    @InterfaceC5056aJ2
    public static String k(List<C3031Gd2> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3031Gd2 c3031Gd2 = list.get(i2);
            sb.append(c3031Gd2.X);
            sb.append('.');
            sb.append(c3031Gd2.Y);
            sb.append('.');
            sb.append(c3031Gd2.Z);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static G50 n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        int i2 = 0;
        C5972e60.b f2 = new C5972e60.b((String) C9542sf.g(cursor.getString(0)), Uri.parse((String) C9542sf.g(cursor.getString(2)))).e(cursor.getString(1)).f(j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        C5972e60 a2 = f2.d(blob).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        C5487c60 c5487c60 = new C5487c60();
        c5487c60.a = cursor.getLong(13);
        c5487c60.b = cursor.getFloat(12);
        int i3 = cursor.getInt(6);
        if (i3 == 4) {
            i2 = cursor.getInt(11);
        }
        return new G50(a2, i3, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2, c5487c60);
    }

    public static G50 o(Cursor cursor) {
        int i2 = 0;
        C5972e60 a2 = new C5972e60.b((String) C9542sf.g(cursor.getString(0)), Uri.parse((String) C9542sf.g(cursor.getString(2)))).e(q(cursor.getString(1))).f(j(cursor.getString(3))).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        C5487c60 c5487c60 = new C5487c60();
        c5487c60.a = cursor.getLong(13);
        c5487c60.b = cursor.getFloat(12);
        int i3 = cursor.getInt(6);
        if (i3 == 4) {
            i2 = cursor.getInt(11);
        }
        return new G50(a2, i3, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2, c5487c60);
    }

    public static String p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i2]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static String q(@InterfaceC11300zs1 String str) {
        if ("dash".equals(str)) {
            return C4128Rj1.t0;
        }
        if ("hls".equals(str)) {
            return C4128Rj1.u0;
        }
        if ("ss".equals(str)) {
            return C4128Rj1.v0;
        }
        return C4128Rj1.D;
    }

    @Override // o.LN2
    public void a(String str, int i2) throws YU {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            String str2 = this.b;
            writableDatabase.update(str2, contentValues, N + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new YU(e);
        }
    }

    @Override // o.LN2
    public void b(String str) throws YU {
        l();
        try {
            this.c.getWritableDatabase().delete(this.b, "id = ?", new String[]{str});
        } catch (SQLiteException e) {
            throw new YU(e);
        }
    }

    @Override // o.LN2
    public void c(int i2) throws YU {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.c.getWritableDatabase().update(this.b, contentValues, N, null);
        } catch (SQLException e) {
            throw new YU(e);
        }
    }

    @Override // o.V50
    public I50 d(int... iArr) throws YU {
        l();
        return new b(m(p(iArr), null));
    }

    @Override // o.LN2
    public void e() throws YU {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put(s, (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, null, null);
        } catch (SQLException e) {
            throw new YU(e);
        }
    }

    @Override // o.LN2
    public void f() throws YU {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.c.getWritableDatabase().update(this.b, contentValues, M, null);
        } catch (SQLException e) {
            throw new YU(e);
        }
    }

    @Override // o.V50
    @InterfaceC11300zs1
    public G50 g(String str) throws YU {
        l();
        try {
            Cursor m2 = m("id = ?", new String[]{str});
            if (m2.getCount() == 0) {
                m2.close();
                return null;
            }
            m2.moveToNext();
            G50 n2 = n(m2);
            m2.close();
            return n2;
        } catch (SQLiteException e) {
            throw new YU(e);
        }
    }

    @Override // o.LN2
    public void h(G50 g50) throws YU {
        l();
        try {
            s(g50, this.c.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new YU(e);
        }
    }

    public final void l() throws YU {
        List<G50> arrayList;
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            try {
                int b2 = XE2.b(this.c.getReadableDatabase(), 0, this.a);
                if (b2 != 3) {
                    SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        XE2.d(writableDatabase, 0, this.a, 3);
                        if (b2 == 2) {
                            arrayList = r(writableDatabase);
                        } else {
                            arrayList = new ArrayList<>();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.b);
                        writableDatabase.execSQL("CREATE TABLE " + this.b + C4500Ve2.b + P);
                        for (G50 g50 : arrayList) {
                            s(g50, writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.e = true;
            } catch (SQLException e) {
                throw new YU(e);
            }
        }
    }

    public final Cursor m(String str, @InterfaceC11300zs1 String[] strArr) throws YU {
        try {
            return this.c.getReadableDatabase().query(this.b, O, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new YU(e);
        }
    }

    public final List<G50> r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!TD2.P1(sQLiteDatabase, this.b)) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query(this.b, new String[]{"id", "title", "uri", k, l, "data", "state", f431o, p, q, "stop_reason", s, t, u}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(o(query));
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        query.close();
        return arrayList;
    }

    public final void s(G50 g50, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = g50.a.Z0;
        if (bArr == null) {
            bArr = TD2.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", g50.a.X);
        contentValues.put(i, g50.a.Z);
        contentValues.put("uri", g50.a.Y.toString());
        contentValues.put(k, k(g50.a.Y0));
        contentValues.put(l, g50.a.a1);
        contentValues.put("data", g50.a.b1);
        contentValues.put("state", Integer.valueOf(g50.b));
        contentValues.put(f431o, Long.valueOf(g50.c));
        contentValues.put(p, Long.valueOf(g50.d));
        contentValues.put(q, Long.valueOf(g50.e));
        contentValues.put("stop_reason", Integer.valueOf(g50.f));
        contentValues.put(s, Integer.valueOf(g50.g));
        contentValues.put(t, Float.valueOf(g50.b()));
        contentValues.put(u, Long.valueOf(g50.a()));
        contentValues.put(v, bArr);
        sQLiteDatabase.replaceOrThrow(this.b, null, contentValues);
    }

    public CY(InterfaceC5100aV interfaceC5100aV, String str) {
        this.a = str;
        this.c = interfaceC5100aV;
        this.b = f + str;
        this.d = new Object();
    }
}
