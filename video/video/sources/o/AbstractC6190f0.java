package o;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;

/* renamed from: o.f0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6190f0 implements VI0 {
    public final Writer X;
    public String Y;
    public volatile IOException Y0;
    public InterfaceC5584cU1 Z;

    public AbstractC6190f0(Writer writer, String str) {
        this.X = writer;
        this.Y = str;
    }

    @Override // o.VI0
    public void K2(String[] strArr, boolean z) {
        try {
            f(strArr, z, new StringBuilder(1024));
        } catch (IOException e) {
            this.Y0 = e;
        }
    }

    @Override // o.VI0
    public int T4(ResultSet resultSet, boolean z, boolean z2, boolean z3) throws SQLException, IOException {
        int i;
        if (z) {
            d(resultSet, z3);
            i = 1;
        } else {
            i = 0;
        }
        while (resultSet.next()) {
            K2(a().a(resultSet, z2), z3);
            i++;
        }
        return i;
    }

    @Override // o.VI0
    public IOException Y0() {
        return this.Y0;
    }

    public InterfaceC5584cU1 a() {
        if (this.Z == null) {
            this.Z = new C5827dU1();
        }
        return this.Z;
    }

    @Override // o.VI0
    public void b4(InterfaceC5584cU1 interfaceC5584cU1) {
        this.Z = interfaceC5584cU1;
    }

    @Override // o.VI0
    public boolean checkError() {
        Writer writer = this.X;
        if (writer instanceof PrintWriter) {
            return ((PrintWriter) writer).checkError();
        }
        if (this.Y0 != null) {
            q4();
        } else {
            try {
                flush();
            } catch (IOException e) {
                this.Y0 = e;
            }
        }
        if (this.Y0 != null) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.X.close();
    }

    public void d(ResultSet resultSet, boolean z) throws SQLException {
        K2(a().d(resultSet), z);
    }

    public abstract void f(String[] strArr, boolean z, Appendable appendable) throws IOException;

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.X.flush();
    }

    @Override // o.VI0
    public void q2(Iterable<String[]> iterable, boolean z) {
        StringBuilder sb = new StringBuilder(1024);
        try {
            for (String[] strArr : iterable) {
                f(strArr, z, sb);
                sb.setLength(0);
            }
        } catch (IOException e) {
            this.Y0 = e;
        }
    }

    @Override // o.VI0
    public void v0() {
        this.Y0 = null;
    }
}
