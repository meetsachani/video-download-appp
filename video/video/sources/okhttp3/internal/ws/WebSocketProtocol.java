package okhttp3.internal.ws;

import o.C5422bq;
import o.C6562gT0;
import o.C8859ps;
import o.InterfaceC8303na2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nWebSocketProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketProtocol.kt\nokhttp3/internal/ws/WebSocketProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: classes4.dex */
public final class WebSocketProtocol {
    @NotNull
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    @NotNull
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    @NotNull
    public final String acceptHeader(@NotNull String str) {
        C6562gT0.p(str, "key");
        C8859ps.a aVar = C8859ps.Y0;
        return aVar.l(str + ACCEPT_MAGIC).d0().i();
    }

    @Nullable
    public final String closeCodeExceptionMessage(int i) {
        if (i >= 1000 && i < 5000) {
            if ((1004 <= i && i < 1007) || (1015 <= i && i < 3000)) {
                return "Code " + i + " is reserved and may not be used.";
            }
            return null;
        }
        return "Code must be in range [1000,5000): " + i;
    }

    public final void toggleMask(@NotNull C5422bq.c cVar, @NotNull byte[] bArr) {
        C6562gT0.p(cVar, "cursor");
        C6562gT0.p(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.Z0;
            int i2 = cVar.a1;
            int i3 = cVar.b1;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
        } while (cVar.f() != -1);
    }

    public final void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            return;
        }
        C6562gT0.m(closeCodeExceptionMessage);
        throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
    }
}
