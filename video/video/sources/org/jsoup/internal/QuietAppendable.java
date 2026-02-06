package org.jsoup.internal;

import java.io.IOException;
import org.jsoup.SerializationException;
import org.jsoup.internal.QuietAppendable;

/* loaded from: classes4.dex */
public abstract class QuietAppendable {

    /* loaded from: classes4.dex */
    public static final class BaseAppendable extends QuietAppendable {
        public final Appendable a;

        @FunctionalInterface
        /* loaded from: classes4.dex */
        public interface Action {
            void a() throws IOException;
        }

        public static /* synthetic */ void e(BaseAppendable baseAppendable, CharSequence charSequence) {
            baseAppendable.a.append(charSequence);
        }

        public static /* synthetic */ void f(BaseAppendable baseAppendable, char[] cArr, int i, int i2) {
            baseAppendable.a.append(new String(cArr, i, i2));
        }

        public static /* synthetic */ void g(BaseAppendable baseAppendable, char c) {
            baseAppendable.a.append(c);
        }

        @Override // org.jsoup.internal.QuietAppendable
        public QuietAppendable c(final char[] cArr, final int i, final int i2) {
            return j(new Action() { // from class: org.jsoup.internal.b
                @Override // org.jsoup.internal.QuietAppendable.BaseAppendable.Action
                public final void a() {
                    QuietAppendable.BaseAppendable.f(QuietAppendable.BaseAppendable.this, cArr, i, i2);
                }
            });
        }

        @Override // org.jsoup.internal.QuietAppendable
        /* renamed from: h */
        public BaseAppendable a(final char c) {
            return j(new Action() { // from class: org.jsoup.internal.a
                @Override // org.jsoup.internal.QuietAppendable.BaseAppendable.Action
                public final void a() {
                    QuietAppendable.BaseAppendable.g(QuietAppendable.BaseAppendable.this, c);
                }
            });
        }

        @Override // org.jsoup.internal.QuietAppendable
        /* renamed from: i */
        public BaseAppendable b(final CharSequence charSequence) {
            return j(new Action() { // from class: org.jsoup.internal.c
                @Override // org.jsoup.internal.QuietAppendable.BaseAppendable.Action
                public final void a() {
                    QuietAppendable.BaseAppendable.e(QuietAppendable.BaseAppendable.this, charSequence);
                }
            });
        }

        public final BaseAppendable j(Action action) {
            try {
                action.a();
                return this;
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        public BaseAppendable(Appendable appendable) {
            this.a = appendable;
        }
    }

    /* loaded from: classes4.dex */
    public static final class StringBuilderAppendable extends QuietAppendable {
        public final StringBuilder a;

        @Override // org.jsoup.internal.QuietAppendable
        public QuietAppendable c(char[] cArr, int i, int i2) {
            this.a.append(cArr, i, i2);
            return this;
        }

        @Override // org.jsoup.internal.QuietAppendable
        /* renamed from: e */
        public StringBuilderAppendable a(char c) {
            this.a.append(c);
            return this;
        }

        @Override // org.jsoup.internal.QuietAppendable
        /* renamed from: f */
        public StringBuilderAppendable b(CharSequence charSequence) {
            this.a.append(charSequence);
            return this;
        }

        public String toString() {
            return this.a.toString();
        }

        public StringBuilderAppendable(StringBuilder sb) {
            this.a = sb;
        }
    }

    public static QuietAppendable d(Appendable appendable) {
        if (appendable instanceof StringBuilder) {
            return new StringBuilderAppendable((StringBuilder) appendable);
        }
        return new BaseAppendable(appendable);
    }

    public abstract QuietAppendable a(char c);

    public abstract QuietAppendable b(CharSequence charSequence);

    public abstract QuietAppendable c(char[] cArr, int i, int i2);
}
