package o;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

@Deprecated
/* renamed from: o.Qe0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4010Qe0 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public C4010Qe0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(C3816Oe0 c3816Oe0) {
        this.a.reset();
        try {
            b(this.b, c3816Oe0.X);
            String str = c3816Oe0.Y;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            this.b.writeLong(c3816Oe0.Z);
            this.b.writeLong(c3816Oe0.Y0);
            this.b.write(c3816Oe0.Z0);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
