package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* renamed from: o.oK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8487oK0 extends RandomAccessFile {
    public final File X;
    public final String Y;

    public C8487oK0(File file, String str) throws FileNotFoundException {
        super(file, str);
        this.X = file;
        this.Y = str;
    }

    public File a() {
        return this.X;
    }

    public String d() {
        return this.Y;
    }

    public String toString() {
        return Objects.toString(this.X);
    }

    public C8487oK0(String str, String str2) throws FileNotFoundException {
        super(str, str2);
        this.X = str != null ? new File(str) : null;
        this.Y = str2;
    }
}
