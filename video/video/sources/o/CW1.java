package o;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public class CW1 implements InterfaceC10771xh2 {
    public final Context X;
    public final String Y;
    public final int Y0;
    public final File Z;
    public final InterfaceC10771xh2 Z0;
    public XU a1;
    public boolean b1;

    public CW1(Context context, String str, File file, int i, InterfaceC10771xh2 interfaceC10771xh2) {
        this.X = context;
        this.Y = str;
        this.Z = file;
        this.Y0 = i;
        this.Z0 = interfaceC10771xh2;
    }

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.Y != null) {
            channel = Channels.newChannel(this.X.getAssets().open(this.Y));
        } else if (this.Z != null) {
            channel = new FileInputStream(this.Z).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.X.getCacheDir());
        createTempFile.deleteOnExit();
        C5180aq0.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (createTempFile.renameTo(file)) {
        } else {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }

    @Override // o.InterfaceC10771xh2, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.Z0.close();
        this.b1 = false;
    }

    public void d(XU xu) {
        this.a1 = xu;
    }

    public final void f() {
        boolean z;
        String databaseName = getDatabaseName();
        File databasePath = this.X.getDatabasePath(databaseName);
        XU xu = this.a1;
        if (xu != null && !xu.j) {
            z = false;
        } else {
            z = true;
        }
        NP np = new NP(databaseName, this.X.getFilesDir(), z);
        try {
            np.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    np.c();
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            } else if (this.a1 == null) {
                np.c();
                return;
            } else {
                try {
                    int e2 = UT.e(databasePath);
                    int i = this.Y0;
                    if (e2 == i) {
                        np.c();
                        return;
                    } else if (this.a1.a(e2, i)) {
                        np.c();
                        return;
                    } else {
                        if (this.X.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e3) {
                                Log.w(UU1.a, "Unable to copy database file.", e3);
                            }
                        } else {
                            Log.w(UU1.a, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        np.c();
                        return;
                    }
                } catch (IOException e4) {
                    Log.w(UU1.a, "Unable to read database version.", e4);
                    np.c();
                    return;
                }
            }
        } catch (Throwable th) {
            np.c();
            throw th;
        }
        np.c();
        throw th;
    }

    @Override // o.InterfaceC10771xh2
    public String getDatabaseName() {
        return this.Z0.getDatabaseName();
    }

    @Override // o.InterfaceC10771xh2
    public synchronized InterfaceC10528wh2 getReadableDatabase() {
        try {
            if (!this.b1) {
                f();
                this.b1 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Z0.getReadableDatabase();
    }

    @Override // o.InterfaceC10771xh2
    public synchronized InterfaceC10528wh2 getWritableDatabase() {
        try {
            if (!this.b1) {
                f();
                this.b1 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Z0.getWritableDatabase();
    }

    @Override // o.InterfaceC10771xh2
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.Z0.setWriteAheadLoggingEnabled(z);
    }
}
