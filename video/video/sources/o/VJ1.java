package o;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
/* loaded from: classes2.dex */
public abstract class VJ1 {
    public static final ProtobufEncoder a = ProtobufEncoder.a().e(C5390bi.b).d();

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return a.c(obj);
    }

    public abstract ID c();
}
