package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public interface EU {

    /* loaded from: classes2.dex */
    public interface a {
        EU a();
    }

    void a(OU ou) throws IOException;

    void close() throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
