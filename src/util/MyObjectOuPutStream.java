package util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOuPutStream extends ObjectOutputStream {

	public MyObjectOuPutStream(OutputStream out) throws IOException {
		super(out);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO �Զ����ɵķ������
		return;
	}


}
