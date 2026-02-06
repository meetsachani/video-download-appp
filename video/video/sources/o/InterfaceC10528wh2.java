package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

/* renamed from: o.wh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10528wh2 extends Closeable {
    long A4(String str, int i, ContentValues contentValues) throws SQLException;

    List<Pair<String, String>> F0();

    void J0();

    void K0(String str) throws SQLException;

    boolean P0();

    void S1(SQLiteTransactionListener sQLiteTransactionListener);

    boolean V1();

    void V4(SQLiteTransactionListener sQLiteTransactionListener);

    void W1();

    boolean W4();

    String Y();

    void c4(boolean z);

    int d0();

    boolean d2(int i);

    boolean isOpen();

    boolean isReadOnly();

    boolean j3(long j);

    long j4();

    int k4(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    Cursor l3(String str, Object[] objArr);

    boolean l5();

    long n1();

    void o5(int i);

    void p3(int i);

    boolean q1();

    boolean r4();

    void r5(long j);

    void s1();

    void setLocale(Locale locale);

    int t0(String str, String str2, Object[] objArr);

    void u1(String str, Object[] objArr) throws SQLException;

    Cursor u4(String str);

    void v1();

    void w0();

    Cursor x3(InterfaceC11257zh2 interfaceC11257zh2, CancellationSignal cancellationSignal);

    Cursor y1(InterfaceC11257zh2 interfaceC11257zh2);

    long z1(long j);

    InterfaceC2546Bh2 z3(String str);
}
