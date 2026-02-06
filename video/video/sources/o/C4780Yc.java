package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Yc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4780Yc implements InterfaceC10725xV {
    public static final String b = "prdownloader";
    public final SQLiteDatabase a;

    public C4780Yc(Context context) {
        this.a = new ZU(context).getWritableDatabase();
    }

    @Override // o.InterfaceC10725xV
    public void a(C5002a60 c5002a60) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", c5002a60.h());
            contentValues.put(C5002a60.k, c5002a60.c());
            contentValues.put(C5002a60.l, c5002a60.a());
            contentValues.put(C5002a60.m, c5002a60.d());
            contentValues.put(C5002a60.n, Long.valueOf(c5002a60.g()));
            contentValues.put(C5002a60.f691o, Long.valueOf(c5002a60.b()));
            contentValues.put(C5002a60.p, Long.valueOf(c5002a60.f()));
            this.a.update(b, contentValues, "id = ? ", new String[]{String.valueOf(c5002a60.e())});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.InterfaceC10725xV
    public void b(C5002a60 c5002a60) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(c5002a60.e()));
            contentValues.put("url", c5002a60.h());
            contentValues.put(C5002a60.k, c5002a60.c());
            contentValues.put(C5002a60.l, c5002a60.a());
            contentValues.put(C5002a60.m, c5002a60.d());
            contentValues.put(C5002a60.n, Long.valueOf(c5002a60.g()));
            contentValues.put(C5002a60.f691o, Long.valueOf(c5002a60.b()));
            contentValues.put(C5002a60.p, Long.valueOf(c5002a60.f()));
            this.a.insert(b, null, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.InterfaceC10725xV
    public C5002a60 c(int i) {
        C5002a60 c5002a60;
        Cursor cursor = null;
        r0 = null;
        C5002a60 c5002a602 = null;
        Cursor cursor2 = null;
        try {
            try {
                Cursor rawQuery = this.a.rawQuery("SELECT * FROM prdownloader WHERE id = " + i, null);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.moveToFirst()) {
                                c5002a60 = new C5002a60();
                                try {
                                    c5002a60.m(i);
                                    c5002a60.p(rawQuery.getString(rawQuery.getColumnIndex("url")));
                                    c5002a60.k(rawQuery.getString(rawQuery.getColumnIndex(C5002a60.k)));
                                    c5002a60.i(rawQuery.getString(rawQuery.getColumnIndex(C5002a60.l)));
                                    c5002a60.l(rawQuery.getString(rawQuery.getColumnIndex(C5002a60.m)));
                                    c5002a60.o(rawQuery.getLong(rawQuery.getColumnIndex(C5002a60.n)));
                                    c5002a60.j(rawQuery.getLong(rawQuery.getColumnIndex(C5002a60.f691o)));
                                    c5002a60.n(rawQuery.getLong(rawQuery.getColumnIndex(C5002a60.p)));
                                    c5002a602 = c5002a60;
                                } catch (Exception e) {
                                    e = e;
                                    cursor = rawQuery;
                                    e.printStackTrace();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return c5002a60;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = rawQuery;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c5002a60 = null;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return c5002a602;
            } catch (Exception e3) {
                e = e3;
                c5002a60 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o.InterfaceC10725xV
    public void clear() {
        try {
            this.a.delete(b, null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.InterfaceC10725xV
    public void d(int i, long j, long j2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C5002a60.f691o, Long.valueOf(j));
            contentValues.put(C5002a60.p, Long.valueOf(j2));
            this.a.update(b, contentValues, "id = ? ", new String[]{String.valueOf(i)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    @Override // o.InterfaceC10725xV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<C5002a60> e(int i) {
        ArrayList arrayList = new ArrayList();
        long j = i * 86400 * 1000;
        Cursor cursor = null;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis() - j;
                SQLiteDatabase sQLiteDatabase = this.a;
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM prdownloader WHERE last_modified_at <= " + currentTimeMillis, null);
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
            if (cursor != null && cursor.moveToFirst()) {
                do {
                    C5002a60 c5002a60 = new C5002a60();
                    c5002a60.m(cursor.getInt(cursor.getColumnIndex("id")));
                    c5002a60.p(cursor.getString(cursor.getColumnIndex("url")));
                    c5002a60.k(cursor.getString(cursor.getColumnIndex(C5002a60.k)));
                    c5002a60.i(cursor.getString(cursor.getColumnIndex(C5002a60.l)));
                    c5002a60.l(cursor.getString(cursor.getColumnIndex(C5002a60.m)));
                    c5002a60.o(cursor.getLong(cursor.getColumnIndex(C5002a60.n)));
                    c5002a60.j(cursor.getLong(cursor.getColumnIndex(C5002a60.f691o)));
                    c5002a60.n(cursor.getLong(cursor.getColumnIndex(C5002a60.p)));
                    arrayList.add(c5002a60);
                } while (cursor.moveToNext());
                if (cursor != null) {
                }
                return arrayList;
            }
            if (cursor != null) {
                cursor.close();
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // o.InterfaceC10725xV
    public void remove(int i) {
        try {
            SQLiteDatabase sQLiteDatabase = this.a;
            sQLiteDatabase.execSQL("DELETE FROM prdownloader WHERE id = " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
