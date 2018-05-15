import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
/*
 * 注意：
1.逆向工程生成的代码只能做单表查询
2.不能在生成的代码上进行扩展，因为如果数据库变更，需要重新使用逆向工程生成代码，原来编写的代码就被覆盖了。
3.一张表会生成4个文件
 */
public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("generatorConfig.xml"); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


/*
*
2018-05-14 11:55:55,327 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Retrieving column information for table "user"
2018-05-14 11:55:55,955 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "id", data type 4, in table "ms..user"
2018-05-14 11:55:55,956 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "username", data type 12, in table "ms..user"
2018-05-14 11:55:55,956 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "birthday", data type 91, in table "ms..user"
2018-05-14 11:55:55,956 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "sex", data type 1, in table "ms..user"
2018-05-14 11:55:55,956 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "address", data type 12, in table "ms..user"
2018-05-14 11:55:55,974 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Retrieving column information for table "orders"
2018-05-14 11:55:56,470 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "id", data type 4, in table "ms..orders"
2018-05-14 11:55:56,470 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "user_id", data type 4, in table "ms..orders"
2018-05-14 11:55:56,470 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "number", data type 12, in table "ms..orders"
2018-05-14 11:55:56,470 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "createtime", data type 93, in table "ms..orders"
2018-05-14 11:55:56,470 [main] DEBUG [org.mybatis.generator.internal.db.DatabaseIntrospector] - Found column "note", data type 12, in table "ms..orders"

*/