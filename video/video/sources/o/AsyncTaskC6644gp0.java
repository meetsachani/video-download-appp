package o;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.gp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class AsyncTaskC6644gp0 extends AsyncTask<String, Void, Boolean> {
    @NotNull
    public final String a;
    @NotNull
    public final File b;
    @NotNull
    public final a c;

    /* renamed from: o.gp0$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(@NotNull File file);
    }

    public AsyncTaskC6644gp0(@NotNull String str, @NotNull File file, @NotNull a aVar) {
        C6562gT0.p(str, "uriStr");
        C6562gT0.p(file, "destFile");
        C6562gT0.p(aVar, "onSuccess");
        this.a = str;
        this.b = file;
        this.c = aVar;
    }

    @InterfaceC5056aJ2(otherwise = 4)
    @NotNull
    public Boolean a(@NotNull String... strArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            if (SQ.e(this) || SQ.e(this)) {
                return null;
            }
            try {
                C6562gT0.p(strArr, "args");
                try {
                    URL url = new URL(this.a);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        } catch (Throwable th2) {
            SQ.c(th2, this);
            return null;
        }
    }

    public void b(boolean z) {
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this) && z) {
                    this.c.a(this.b);
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            if (SQ.e(this) || SQ.e(this)) {
                return null;
            }
            return a(strArr);
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (!SQ.e(this)) {
            try {
                if (!SQ.e(this) && !SQ.e(this)) {
                    b(bool.booleanValue());
                }
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
