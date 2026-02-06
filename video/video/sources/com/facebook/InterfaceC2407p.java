package com.facebook;

import android.content.Intent;
import com.facebook.internal.C2361f;
import o.C6562gT0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2407p {

    /* renamed from: com.facebook.p$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public final int b;
        @Nullable
        public final Intent c;

        public a(int i, int i2, @Nullable Intent intent) {
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        public static /* synthetic */ a e(a aVar, int i, int i2, Intent intent, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = aVar.a;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.b;
            }
            if ((i3 & 4) != 0) {
                intent = aVar.c;
            }
            return aVar.d(i, i2, intent);
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @Nullable
        public final Intent c() {
            return this.c;
        }

        @NotNull
        public final a d(int i, int i2, @Nullable Intent intent) {
            return new a(i, i2, intent);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && C6562gT0.g(this.c, aVar.c);
            }
            return false;
        }

        @Nullable
        public final Intent f() {
            return this.c;
        }

        public final int g() {
            return this.a;
        }

        public final int h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31;
            Intent intent = this.c;
            return hashCode + (intent == null ? 0 : intent.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ')';
        }
    }

    /* renamed from: com.facebook.p$b */
    /* loaded from: classes2.dex */
    public static final class b {
        @NotNull
        public static final b a = new b();

        @InterfaceC9511sW0
        @NotNull
        public static final InterfaceC2407p a() {
            return new C2361f();
        }
    }

    boolean onActivityResult(int i, int i2, @Nullable Intent intent);
}
