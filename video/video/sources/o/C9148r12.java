package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: o.r12  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9148r12 implements Serializable {
    public static final C9148r12 Y = new C9148r12(C4639Wp0.d);
    private static final long serialVersionUID = 1;
    public FileTime X;

    public C9148r12(FileTime fileTime) {
        Objects.requireNonNull(fileTime);
        this.X = C8856pr0.a(fileTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        FileTime from;
        from = FileTime.from(com.facebook.gamingservices.D.a(objectInputStream.readObject()));
        this.X = from;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Instant instant;
        instant = this.X.toInstant();
        objectOutputStream.writeObject(instant);
    }

    public int a(FileTime fileTime) {
        int compareTo;
        compareTo = this.X.compareTo(fileTime);
        return compareTo;
    }

    public long b(TimeUnit timeUnit) {
        long j;
        j = this.X.to(timeUnit);
        return j;
    }

    public Instant c() {
        Instant instant;
        instant = this.X.toInstant();
        return instant;
    }

    public long d() {
        long millis;
        millis = this.X.toMillis();
        return millis;
    }

    public FileTime e() {
        return this.X;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9148r12)) {
            return false;
        }
        return Objects.equals(this.X, ((C9148r12) obj).X);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.X.hashCode();
        return hashCode;
    }

    public String toString() {
        String fileTime;
        fileTime = this.X.toString();
        return fileTime;
    }
}
