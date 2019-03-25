
#import "RNEPubLib.h"
#import <React/RCTLog.h>
@implementation RNEPubLib

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()
RCT_EXPORT_METHOD(openEPub:(NSString *)urls){
    RCTLogInfo(@"Welcome, %@", urls);
}
@end


