package chat1.li.chatting.global.initData;

import chat1.li.chatting.domain.chat.ChatRoom.entity.ChatRoom;
import chat1.li.chatting.domain.chat.ChatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {

    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("축구");
            ChatRoom chatRoom2 = chatRoomService.make("농구");
            ChatRoom chatRoom3 = chatRoomService.make("야구");

            IntStream.rangeClosed(1, 100).forEach(no -> {
                chatRoomService.write(chatRoom1.getId(), "홍길동", "내용 " + no);
            });
        };
    }
}
